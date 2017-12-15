package com.acme.backend;

import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;

@Service("sign")
public class SignImpl implements Sign {
    public Response verifySignedJson(JsonBean input) {
        return Response.ok().build();
    }
}
