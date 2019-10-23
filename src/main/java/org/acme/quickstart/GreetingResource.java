package org.acme.quickstart;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.quickstart.vo.Car;

@Path("/car")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
    	Jsonb jsonb = JsonbBuilder.create();
		
    	String json = "{\"name\":\"Fusca\"}";
    	
    	Car car = jsonb.fromJson(json, Car.class);
    	
    	return "hello =  " + car.getName();
    }
}