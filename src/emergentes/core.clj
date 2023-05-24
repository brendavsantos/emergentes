(ns emergentes.core
  (:require [schema.core :as s
             :include-macros true]
            [clojure.data.json :as json]
            [schema.coerce :as coerce]
            [schema-tools.core :as st]))

(s/defschema data [{:authors [{(s/optional-key :nationality) s/Str
                              (s/optional-key :birthCountry) s/Str
                              (s/optional-key :birthCity) s/Str
                              (s/optional-key :birthState) s/Str
                              (s/optional-key :identifier.lattes) s/Str
                              (s/optional-key :identifier.orcid) s/Str}]
                   :title s/Str
                   :publicationDate s/Str
                   :language s/Str}])

(def parse-data-request (coerce/coercer data coerce/json-coercion-matcher)) 

(defn completeness-identifier [author weight] 
  (if (and (contains? author :identifier.lattes)
          (contains? author :identifier.orcid))
    0
    (if (or (contains? author :identifier.lattes)
             (contains? author :identifier.orcid))
      weight
      0)))

(defn completeness-author [author weight]
  (+ (completeness-identifier author (/ weight 5.0))
     (if (contains? author :nationality) (/ weight 5.0) 0)
     (if (contains? author :birthCountry) (/ weight 5.0) 0)
     (if (contains? author :birthCity) (/ weight 5.0) 0)
     (if (contains? author :birthState) (/ weight 5.0) 0)))

(defn completeness-authors [authors weight author-index] 
  (let [count-authors (count authors)]
    (if (< author-index count-authors)
      (+ (completeness-authors authors weight (inc author-index))
         (completeness-author (nth authors author-index)
                              (/ 25.0 count-authors)))
      0)))

(defn completeness [keyword publication weight]
  (if (contains? publication keyword)
    (if (= keyword :authors) 
      (completeness-authors (:authors publication) weight 0)
      weight)
    0))

(defn validate-publication [publication]
  (+ (completeness :title publication 25)
     (completeness :publicationDate publication 25)
     (completeness :language publication 25)
     (completeness :authors publication 25)))

(def publications
  (parse-data-request (st/select-schema
                       (json/read-str
                        (slurp "resources/extratoFioCruz.json") :key-fn keyword) data)))

(defn validate-publications [] 
    (map validate-publication publications))

(validate-publications)


