CREATE TABLE business (
       uprn varchar(40) NOT NULL,
       nndr_prop_ref varchar(40),
       start_date date,
       end_date date);

CREATE TABLE address (
       uprn varchar(40) NOT NULL,
       data_source varchar(100) NOT NULL,
       premises_ref varchar(40),
       address_fields varchar(255),
       postcode varchar(20));

CREATE TABLE business_name (
       uprn varchar(40) NOT NULL,
       data_source varchar(100) NOT NULL,
       premises_ref varchar(40),
       civica_preferred_name boolean,
       business_name varchar(255),
       update_date date,
       start_date date,
       end_date date);
