(ns emergentes.core-test
  (:require [clojure.test :refer :all]
            [emergentes.core :refer :all]))

  (let [test-cases [{:author {:nationality "Brasileiro"
                              :birthCountry "Brasil"
                              :birthCity "Sao Paulo"
                              :birthState "SP"
                              :identifier.lattes "502205"}
                     :weight 5.0}

                    {:author {:nationality "Americano"
                              :birthCountry "USA"
                              :birthCity "New York"
                              :birthState "NY"
                              :identifier.lattes "123456"}
                     :weight 4.0}
                    {:author {:nationality "Alemao"
                              :birthCountry "Alemanha"
                              :birthCity "Berlin"
                              :birthState "Brandemburgo"
                              :identifier.lattes "654139"}
                     :weight 4.0}
                    {:author {:nationality "Colombiano"
                              :birthCountry "Colombia"
                              :birthCity "Bogota"
                              :birthState "Cundinamarca"
                              :identifier.lattes "402902"}
                     :weight 4.0}
                    ]]
    
    (doseq [test-case test-cases]
      (let [author (:author test-case)
            weight (:weight test-case)]
        (testing (str "Verificar a completude de um autor com parâmetros: " author " e peso: " weight)
          (is (= weight (completeness-author author weight))))))) 

(let [test-cases [{:author {:birthCountry "Brasil"
                             :birthCity "Porto Alegre"
                             :birthState "Goias"}
                     :weight 5.0}
                    
                    {:author {:birthCountry "Brasil"
                             :identifier.lattes "310369"}
                     :weight 5.0}
                    
                    {:author {:birthCountry "Brasil"
                             :identifier.orcid "130325"}
                     :weight 5.0}
                    
                    {:author {:birthCity "Gama"}
                     :weight 5.0}
                    
                    {:author {:birthCountry "Brasil"
                             :nationality "Brasileira"
                             :identifier.orcid "677232"}
                     :weight 5.0} 
                    ]]
    (doseq [test-case test-cases]
      (let [author (:author test-case)
            weight (:weight test-case)]
        (testing (str "Verificar a completude de um autor com parâmetros: " author " e peso: " weight)
          (is (= weight (completeness-author author weight)))))))

(let [test-cases [{:author {:identifier.lattes "3035015"}
                     :weight 5.0}
                    
                    {:author {:identifier.orcid "91073"}
                     :weight 5.0} 
                    ]]
    (doseq [test-case test-cases]
      (let [author (:author test-case)
            weight (:weight test-case)]
        (testing (str "Verificar a completude só com um identificador: " author " e peso: " weight)
          (is (= weight (completeness-identifier author weight)))))))

(let [test-cases [{:author {:name "Helena"}
                   :weight 5.0}

                  {:author nil
                   :weight 5.0}

                  {:author {:identifier.lattes "1156310"
                            :identifier.orcid "37023"}
                   :weight 5.0}

                  {:author {:identifier.lattes "1156310"}
                   :weight 5.0} 
                  ]]
  (doseq [test-case test-cases]
    (let [author (:author test-case)
          weight (:weight test-case)]
      (testing (str "Verificar a completude usando os identificadores: " author " e peso: " weight)
        (is (= weight (completeness-identifier author weight))))))) 

(run-tests *ns*) 

