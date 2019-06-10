package be.cruizsan.services;

import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.data.ParserException;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.util.MapTimeZoneCache;

import javax.enterprise.context.ApplicationScoped;
import java.io.IOException;
import java.io.StringReader;

@ApplicationScoped
public class Ics2JsonService {

    public static Calendar transformToJson(String ics){
        System.setProperty("net.fortuna.ical4j.unfolding.relaxed", "true");
        System.setProperty("net.fortuna.ical4j.timezone.cache.impl", MapTimeZoneCache.class.getName());
        StringReader sin = new StringReader(ics);
        CalendarBuilder builder = new CalendarBuilder();
        Calendar calendar = null;
        try {
            calendar = builder.build(sin);
        } catch (IOException e) {} catch (ParserException e) {}
        return calendar;
    }
}