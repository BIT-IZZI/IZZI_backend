package com.team.web.statistics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
interface StatisticsService{

}
@Service
public class StatisticsServiceImpl implements StatisticsService {
    @Autowired StatisticsRepository statisticsRepository;


}
