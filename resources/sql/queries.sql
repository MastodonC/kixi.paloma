-- :name get-business-by-uprn :? :1
-- :doc
SELECT uprn, nndr_prop_ref, start_date, end_date
FROM business
WHERE uprn=:uprn;

-- :name get-addresses :? :*
-- :doc
SELECT uprn, data_source, premises_ref, address_fields, postcode
FROM address
WHERE uprn=:uprn;

-- :name get-business-names :? :*
-- :doc
SELECT uprn, data_source, premises_ref, civica_preferred_name, business_name, update_date, start_date, end_date
FROM business_name
WHERE uprn=:uprn;

-- :name get-civica-business-name :? :1
SELECT business_name, data_source FROM business_name WHERE uprn=:uprn AND data_source='civica' AND civica_preferred_name=True;

-- :name get-llpg-business-name :? :1
SELECT business_name, data_source FROM business_name WHERE uprn=:uprn AND data_source='llpg';
