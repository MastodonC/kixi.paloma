(ns kixi.paloma.handler
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [kixi.paloma.db :as db]
            [kixi.paloma.schema :as kps]
            [clojure.data.json :as json]
            [ring.swagger.schema :refer [coerce!]]
            [schema.core :as s]))

(defn generate-sfl-response [uprn]
  (if-let [llpg-name (db/get-llpg-business-name {:uprn uprn})]
    llpg-name
    (db/get-civica-business-name {:uprn uprn})))

(defn get-business-record [uprn]
  (db/get-business-by-uprn {:uprn uprn}))

(defn get-business-names [uprn]
  (db/get-business-names {:uprn uprn}))

(defn get-addresses [uprn]
  (db/get-addresses {:uprn uprn}))

(defn generate-response [uprn]
  (let [business-record (get-business-record uprn)
        names (get-business-names uprn)
        addresses (get-addresses uprn)]
    (assoc business-record :addresses addresses :names names)))

(def app
  (api
   {:swagger
    {:ui "/"
     :spec "/swagger.json"
     :data {:info {:title "Kixi.paloma"
                   :description "A REST API for UPRNs"}
            :tags [{:name "api", :description "API for business name searches by UPRN"}]}}}

   (context "/api" []
            :tags ["api"]

            (GET "/business" []
                 :summary "Constructs a business record response."
                 :query-params [uprn :- String]
                 (ok (generate-response uprn)))

            (GET "/sfl" []
                 :summary "Returns a business name from LLPG or Civica, empty if not found."
                 :query-params [uprn :- String]
                 (ok (generate-sfl-response uprn)))

            (GET "/heartbeat" []
                 :return {:result String}
                 :summary "Checks server is alive and responding."
                 (ok {:result "heartbeat:alive"})))))
