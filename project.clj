(defproject kixi.paloma "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [metosin/compojure-api "1.1.11"]
                 [org.clojure/data.csv "0.1.4"]
                 [com.layerware/hugsql "0.4.8"]
                 [org.postgresql/postgresql "42.1.4"]
                 [clj-time "0.14.3"] ;; Used for JDBC timestamps (if requried)
                 [environ "1.1.0"]
                 [mount "0.1.12"]
                 [conman "0.7.8"]]
  :ring {:handler kixi.paloma.handler/app}
  :uberjar-name "server.jar"
  :profiles {:dev {:dependencies [[javax.servlet/javax.servlet-api "3.1.0"]]
                   :plugins [[lein-ring "0.12.0"]]}})
