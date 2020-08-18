package com.team.web.statistics;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/statistics")
public class StatisticsController {

    private final StatisticsRepository statisticsRepository;

    public StatisticsController(StatisticsRepository statisticsRepository) {
        this.statisticsRepository = statisticsRepository;
    }

    @GetMapping("/test")
    public void aVoid () {
        statisticsRepository.test();
    }

    @GetMapping("/avg")
    public void avg(){
        System.out.println(statisticsRepository.avgRain());}

        @GetMapping("/rain")
    public void rainProb(){
            System.out.println(statisticsRepository.findStatistics());
        }

}
