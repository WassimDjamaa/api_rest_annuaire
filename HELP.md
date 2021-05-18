# Read Me First
The following was discovered as part of building this project:

* The following dependencies are not known to work with Spring Native: 'Spring Configuration Processor, Spring Boot DevTools, Testcontainers'. As a result, your application may not work as expected.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.5/maven-plugin/reference/html/#build-image)
* [Testcontainers MongoDB Module Reference Guide](https://www.testcontainers.org/modules/databases/mongodb/)
* [Spring Native Reference Guide](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.4.5/reference/htmlsingle/#configuration-metadata-annotation-processor)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.5/reference/htmlsingle/#using-boot-devtools)
* [Testcontainers](https://www.testcontainers.org/)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/2.4.5/reference/htmlsingle/#boot-features-mongodb)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)

### Additional Links
These additional references should also help you:

* [Configure the Spring AOT Plugin](https://docs.spring.io/spring-native/docs/0.9.2/reference/htmlsingle/#spring-aot-maven)

## Spring Native

This project has been configured to let you generate a lightweight container running a native executable.
Docker should be installed and configured on your machine prior to creating the image, see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.9.2/reference/htmlsingle/#getting-started-buildpacks).

To create the image, run the following goal:

```
$ ./mvnw spring-boot:build-image
```

Then, you can run the app like any other container:

```
$ docker run --rm phoneBook:0.0.1-SNAPSHOT
```