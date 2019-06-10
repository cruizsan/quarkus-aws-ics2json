package be.cruizsan.controllers;

import be.cruizsan.services.Ics2JsonService;
import biweekly.ICalendar;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
public class Ics2JsonController {

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public List<ICalendar> ics2json(String ics) {
        return Ics2JsonService.transformToJson(ics);
    }
}