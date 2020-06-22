## Query implementation

Query implementation is almost exactly the same like all other my examples of Query. Only difference is annotation **@Component** at top.
For full code just open  [Query.java](https://github.com/vladimir-dejanovic/graphql-spring-boot-example/blob/master/src/main/java/xyz/itshark/play/graphqlspringboot/example/resolves/Query.java)

Query example in GraphiQL 
```
query {
  allData {
    message
  }
}
```

## Mutation implementation

Mutation implementation is almost exactly the same like all other my examples of Mutation. Only difference is annotation **@Component** at top.
For full code just open  [Mutation.java](https://github.com/vladimir-dejanovic/graphql-spring-boot-example/blob/master/src/main/java/xyz/itshark/play/graphqlspringboot/example/resolves/Mutation.java)

Mutation example in GraphiQL
```
mutation {
  add(message:"Hello") {
    message
  }
}
```

after mutation you can run query again and check if all worked as intended.

## Subscription implementation

Subscription implementation is done using RXJava and by implementing **GraphQLSubscriptionResolver**

For full code example check  [Subscription.java](https://github.com/vladimir-dejanovic/graphql-spring-boot-example/blob/master/src/main/java/xyz/itshark/play/graphqlspringboot/example/resolves/Subscription.java)
 
Subscription **can be** tested from GraphiQL.

Subscription example in GraphiQL
```
subscription {
  data {
    message
  }
}
```