(ns emergentes.core-test
  (:require [clojure.test :refer :all]
            [emergentes.core :refer :all]))

(deftest completeAuthor-test
  (testing "Verificar a completude de um autor com todos os campos preenchidos"
    (is (= 5.0 (completeness-author {:nationality "Brasileiro"
                                     :birthCountry "Brasil"
                                     :birthCity "Sao Paulo"
                                     :birthState "SP"
                                     :identifier.lattes "502205"} 5.0)))))

(deftest incompleteAuthor-test
  (testing "Verificar a completude de um autor com campos faltando"
    (is (= 3.0 (completeness-author {:birthCountry "Brasil"
                                     :birthCity "Porto Alegre"
                                     :birthState "Goias"} 5.0)))
    (is (= 2.0 (completeness-author {:birthCountry "Brasil"
                                     :identifier.lattes "310369"} 5.0)))
    (is (= 2.0 (completeness-author {:birthCountry "Brasil"
                                     :identifier.orcid "130325"} 5.0)))
    (is (= 1.0 (completeness-author {:birthCity "Gama" } 5.0)))
    (is (= 3.0 (completeness-author {:birthCountry "Brasil"
                                     :nationality "Brasileira"
                                     :identifier.orcid "677232"} 5.0)))))

(deftest correctIdentifier-test
  (testing "Verificar a completude só com um identificador"
    (is (= 5.0 (completeness-identifier {:identifier.lattes "3035015"} 5.0)))
    (is (= 5.0 (completeness-identifier {:identifier.orcid "91073"} 5.0)))))

(deftest wrongIdentifier-test
  (testing "Verificar a completude usando os dois identificadores ou nenhum"
    (is (= 0 (completeness-identifier {:name "Helena"} 5.0))) 
    (is (= 0 (completeness-identifier nil 5.0)))
    (is (= 0 (completeness-identifier {:identifier.lattes "1156310"
                                       :identifier.orcid "37023"} 5.0)))
    (is (= 5.0 (completeness-identifier {:identifier.lattes "1156310"} 5.0))))) 


(run-tests *ns*) 
(completeAuthor-test)
(incompleteAuthor-test)
(correctIdentifier-test)
(wrongIdentifier-test)

