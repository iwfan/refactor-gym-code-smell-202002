package cc.xpbootcamp.code_smell_kit.$04_long_parameter_list;

import java.time.LocalDateTime;

public class PollutantEntry {
    String country;
    String state;
    String city;
    String place;
    LocalDateTime localDateTime;
    Float average;
    Float max;
    Float min;
    String pollutant;

    public PollutantEntry(String country, String state, String city, String place, LocalDateTime localDateTime, Float average, Float max, Float min, String pollutant) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.place = place;
        this.localDateTime = localDateTime;
        this.average = average;
        this.max = max;
        this.min = min;
        this.pollutant = pollutant;
    }
}
