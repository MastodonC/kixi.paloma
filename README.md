# kixi.paloma

![Paloma](https://frostsnow.com/uploads/biography/2015/10/05/paloma-faith.jpg)

An API Server based on Compojure-API to deliver a REST service for UPRN's.

## Usage

### Requirements

The database connection url string is stored an an environment variable.

```
export PALOMA_DATABASE_URL=jdbc.postgresql://localhost/palomaapidb
```

### Run the application locally

`lein ring server`

### Packaging and running as standalone jar

```
lein do clean, ring uberjar
java -jar target/server.jar
```

### Packaging as war

`lein ring uberwar`

## License

Copyright ©  Mastodon C Ltd
