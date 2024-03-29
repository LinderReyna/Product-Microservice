<h1 align="center">Product Microservice</h1>

### 1 - Build Projects

To build from source, you need the following installed and available in your `$PATH:`

* [Java 11](https://www.oracle.com/technetwork/java/index.html)

* [Apache Maven 3.3.4 or greater](https://maven.apache.org/)

* [MongoDB 3.4 or greater](https://www.mongodb.com/try/download/community)

After cloning the project, you can build it from source with this command:
```sh
mvn clean install
```

If you don't have maven installed, you may directly use the included [maven wrapper](https://github.com/takari/maven-wrapper), and build with the command:
```sh
./mvnw clean install
```

You can verify if everything works by running from project root:
```sh
mvn spring-boot:run
```