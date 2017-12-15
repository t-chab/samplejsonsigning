package com.acme.backend;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldImpl implements HelloWorld {

    @GET
    @Path("/echo/{input}")
    @Produces("text/plain")
    public String ping(@PathParam("input") String input) {
        return input;
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    @Path("/jsonBean")
    public Response signJson(JsonBean input) {
        return Response.ok().entity(input).build();
    }
}

