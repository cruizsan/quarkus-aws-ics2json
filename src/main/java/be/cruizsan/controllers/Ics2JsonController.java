package be.cruizsan.controllers;

import be.cruizsan.services.Ics2JsonService;
import net.fortuna.ical4j.model.Calendar;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Ics2JsonController {

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Calendar ics2json(String ics) {
        return Ics2JsonService.transformToJson(ics);
    }
}