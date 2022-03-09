package org.example.multimodule.app.controller;

import io.quarkus.logging.Log;
import org.eclipse.microprofile.config.ConfigProvider;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author Jap
 * 2022-02-28 09:49
 */
@Path("configuration")
public class ConfigurationController {
    
    @GET
    @Path("get")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String get(@FormParam("name") String name){
        String value = ConfigProvider.getConfig().getValue(name, String.class);
        Log.info(value);
        return value;
    }
}
