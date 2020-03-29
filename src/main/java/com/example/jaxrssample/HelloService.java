package com.example.jaxrssample;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;


@Path("/hello")
public interface HelloService {

    @GET
    public String hello(@Context HttpServletRequest request);
}
