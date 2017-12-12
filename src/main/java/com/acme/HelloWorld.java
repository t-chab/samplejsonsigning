package com.acme;

import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/hello")
@Service
public interface HelloWorld {
    @GET
    @Path("/echo/{input}")
    @Produces("text/plain")
    String ping(@PathParam("input") String input);

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    @Path("/jsonBean")
    Response signJson(JsonBean input);
}
