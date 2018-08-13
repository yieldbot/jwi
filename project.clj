(defproject edu.mit/jwi "4.0.0"
  :description "Fork of JWI"
  :url "https://github.com/yieldbot/jwi"
  :license {:name "MIT"}
  ;; :dependencies [[com.google.guava/guava "23.2-jre"]
  ;;                [org.apache.hadoop/hadoop-common "2.7.3"]
  ;;                [org.slf4j/slf4j-api "1.7.5"]]
  :java-source-paths ["src"]
  :main nil
  :profiles {:uberjar {:aot :all}
             :dev {:plugins [[lein-pprint "1.1.2"]]
                   :java-source-paths ["src/test/java"]
                   :dependencies [[org.clojure/clojure "1.8.0"]
                                  [junit/junit "4.11"]]}}
  :plugins [[lein-junit "1.1.8"]]
  ;; Just run junit.
  :junit ["src"]
  :junit-formatter "xml"
  :junit-results-dir "test-results"
  :aliases {"test" "junit"})
