package com.acme.backend;

import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;

@Service("hello")
public class HelloWorldImpl implements HelloWorld {
    public Response signJson(JsonBean input) {
        return Response.ok().entity(input).build();
    }
}

