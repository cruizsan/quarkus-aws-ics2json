package be.cruizsan.services;

import biweekly.Biweekly;
import biweekly.ICalendar;
import javax.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class Ics2JsonService {

//    public static Calendar transformToJson(String ics){
//        System.setProperty("net.fortuna.ical4j.unfolding.relaxed", "true");
//        System.setProperty("net.fortuna.ical4j.timezone.cache.impl", MapTimeZoneCache.class.getName());
//        StringReader sin = new StringReader(ics);
//        CalendarBuilder builder = new CalendarBuilder();
//        Calendar calendar = null;
//        try {
//            calendar = builder.build(sin);
//        } catch (IOException | ParserException e) {e.printStackTrace();}
//        return calendar;
//    }
    public static List<ICalendar> transformToJson(String ics){
        return Biweekly.parse(ics).all();
    }
}