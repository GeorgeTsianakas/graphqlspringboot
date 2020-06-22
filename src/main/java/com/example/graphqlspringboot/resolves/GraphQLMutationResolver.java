package com.example.graphqlspringboot.resolves;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphqlspringboot.pojo.Hello;
import com.example.graphqlspringboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Mutation implements GraphQLMutationResolver {

    @Autowired
    HelloService service;

    public Hello add(String message) {
        return service.add(message);
    }

}