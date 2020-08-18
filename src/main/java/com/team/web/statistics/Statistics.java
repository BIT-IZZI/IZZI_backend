package com.team.web.statistics;

import lombok.*;

import javax.persistence.*;

@Getter @Setter @Entity @ToString @NoArgsConstructor
@Table(name="statistics")
public class Statistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="key_id") private Long keyId;

    @Column(name="precipitation_date") private String precipitationDate;
    @Column(name="precipitation_location") private String precipitationLocation;
    @Column(name="precipitation_daily") private double precipitationDaily;
    @Column(name="precipitation_year") private String precipitationYear;
    @Column(name="daily_profit") private String dailyProfit;
    @Column(name="monthly_profit") private String monthlyProfit;
    @Column(name="yearly_profit") private String yearlyProfit;
    @Column(name="pattern") private String pattern;
    @Column(name="rain") private int rain;


    @Builder
    private Statistics(Long keyId,
                       double precipitationDaily,
                       String precipitationDate,
                       String precipitationLocation,
                       String precipitationYear,
                       String dailyProfit,
                       String monthlyProfit,
                       String yearlyProfit,
                       String pattern,
                       int rain
                       ){
        this.keyId=keyId;
        this.precipitationDaily=precipitationDaily;
        this.precipitationDate=precipitationDate;
        this.precipitationLocation=precipitationLocation;
        this.dailyProfit=dailyProfit;
        this.monthlyProfit=monthlyProfit;
        this.yearlyProfit=yearlyProfit;
        this.pattern=pattern;
        this.precipitationYear=precipitationYear;
        this.rain=rain;
    }

}
