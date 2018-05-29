(ns kixi.paloma.schema
  (:require [schema.core :as s]
            [ring.swagger.schema :refer [coerce!]]))

(s/defschema Name {:uprn                   String
                   :data_source            String
                   :premises_ref           String
                   :civica_preferred_name  Boolean
                   :business_name          String
                   :update_date            java.util.Date
                   :start_date             java.util.Date
                   :end_date               java.util.Date})

(s/defschema Address {:uprn            String
                      :data_source     String
                      :premises_ref    String
                      :address_fields  String
                      :postcode        String})

(s/defschema Business {:uprn           String
                       :nndr_prop_ref  String
                       :start_date     java.util.Date
                       :end_date       java.util.Date
                       :addresses      #(Address)
                       :names          #(Name)})
