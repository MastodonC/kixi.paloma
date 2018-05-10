(ns kixi.paloma.handler
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [kixi.paloma.db :as db]
            [schema.core :as s]))

(def app
  (api
   {:swagger
    {:ui "/"
     :spec "/swagger.json"
     :data {:info {:title "Kixi.paloma"
                   :description "A REST API for UPRNs"}
            :tags [{:name "api", :description "some apis"}]}}}

   (context "/api" []
            :tags ["api"]

            (GET "/heartbeat" []
                 :return {:result String}
                 :summary "Checks server is alive and responding."
                 (ok {:result "heartbeat:alive"}))
            )))
