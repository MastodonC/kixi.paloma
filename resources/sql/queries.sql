-- :name get-business-by-uprn :? :*
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
