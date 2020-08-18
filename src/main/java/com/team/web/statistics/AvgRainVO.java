package com.team.web.statistics;

import lombok.Data;

@Data
public class AvgRainVO {
    private String precipitationDate;
    private double avgRain, rainProb;
    private boolean rain;
    private long total;
}
