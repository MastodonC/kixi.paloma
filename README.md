# kixi.paloma

An API Server based on Compojure-API to deliver a REST service for UPRN's.

## Usage

### Requirements

The database connection url string is stored as an environment variable.

```
$ export BX_DATABASE_URL=jdbc.postgresql://hostname:port/databasename?user=dbusername&password=dbpassword
```

### Building the Docker Container

From the project home directory run the following commands:

```
$ lein do clean, ring uberjar
$ docker build -f deployment/Dockerfile .
```

### Run the application locally

Using Docker run the application:

```
docker run --name kixi.paloma -d -i -t -e bx_database_url="${bx_database_url}" -p 3000:3000/tcp [docker_imageid]
```

To test point your browser to `http://localhost:3000/index.html` and you will see the Swagger API home page were you can test the API.


## License

Copyright ©  Mastodon C Ltd
