package com.acme.backend;

import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;

@Service("verify")
public class VerifyImpl implements Verify {
    public Response verifySignedJson(JsonBean input) {
        return Response.ok().build();
    }
}
