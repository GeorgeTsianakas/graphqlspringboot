# GraphQL Spring Boot Example

![](https://img.shields.io/badge/Editor-IntelliJ-informational?style=flat&logo=intellij-idea)
![](https://img.shields.io/badge/Code-Java_8+-informational?style=flat&logo=java)
![](https://img.shields.io/badge/Framework-Spring%20Boot%202.3-informational?style=flat&logo=spring)
![](https://img.shields.io/badge/API-GraphQL-informational?style=flat&logo=graphql)

A minimal GraphQL API built with Spring Boot. It demonstrates Queries, Mutations, and Subscriptions using graphql-java, graphql-java-tools, and the GraphiQL UI for local testing.

## Table of Contents
- Overview
- Features
- Tech Stack
- Getting Started
- Endpoints
- Example Operations
- Project Structure
- Configuration
- Build & Test
- References

## Overview
This sample exposes a simple Hello domain with:
- Query: hello and allData
- Mutation: add(message)
- Subscription: data

It is intended as a learning/reference project for integrating GraphQL with Spring Boot.

## Features
- GraphQL schema-first development (schema.graphqls)
- Resolvers for Query, Mutation, and Subscription
- In-memory storage via a simple service
- Built-in GraphiQL playground for exploration

## Tech Stack
- Java 8+
- Spring Boot 2.3.x
- graphql-java 8.0
- graphql-java-tools 5.0.0
- graphql-spring-boot-starter 5.0.2
- graphiql-spring-boot-starter 5.0.2
- RxJava 2 for subscriptions

## Getting Started
Prerequisites:
- JDK 8+
- Maven 3.6+

Steps:
1. Clone the repository
2. Build the project: mvn clean package
3. Run the app:
   - Using Maven: mvn spring-boot:run
   - Or run the generated jar: java -jar target/graphqlspringboot-0.0.1-SNAPSHOT.jar

By default the application starts on port 8080.

## Endpoints
- GraphQL endpoint: http://localhost:8080/graphql
- GraphiQL UI: http://localhost:8080/graphiql

Note: If you change the server port or management settings, adjust the URLs accordingly.

## Example Operations
Schema (excerpt from src/main/resources/graphql/schema.graphqls):

- Query
  - hello: Hello
  - allData: [Hello]
- Mutation
  - add(message: String): Hello
- Subscription
  - data: Hello

Sample GraphQL documents you can run in GraphiQL:

Query hello:
```
query {
  hello {
    message
  }
}
```

Query allData:
```
query {
  allData {
    message
  }
}
```

Mutation add:
```
mutation {
  add(message: "Hello") {
    message
  }
}
```

Subscription data:
```
subscription {
  data {
    message
  }
}
```

Tip: Open the subscription in one GraphiQL tab, then execute the mutation in another tab to see live updates (powered by RxJava 2).

## Project Structure
- src/main/java/com/example/graphqlspringboot
  - resolves/Query.java — query resolvers
  - resolves/GraphQLMutationResolver.java — mutation resolvers
  - resolves/Subscription.java — subscription resolver (RxJava)
  - service/HelloService.java — simple in-memory data service
  - pojo/Hello.java — data model
- src/main/resources/graphql/schema.graphqls — GraphQL schema
- src/main/resources/application.properties — application configuration

## Configuration
Key configuration lives in application.properties. You can customize server.port and GraphQL settings there if needed.

## Build & Test
- Build: mvn clean package
- Run: mvn spring-boot:run
- Tests: mvn test

## References
- graphql-java: https://www.graphql-java.com/
- Spring Boot: https://spring.io/projects/spring-boot
- GraphiQL: https://github.com/graphql/graphiql
