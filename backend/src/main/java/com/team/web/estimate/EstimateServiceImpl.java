package com.team.web.estimate;

import com.team.web.common.JpaService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
interface EstimateService extends JpaService<Estimate> {

    Iterable<Estimate> findUserByName();
}
@Service
public class EstimateServiceImpl implements EstimateService{
    private final EstimateRepository estimateRepository;

    public EstimateServiceImpl(EstimateRepository estimateRepository){
        this.estimateRepository = estimateRepository;
    }

    @Override
    public Iterable<Estimate> findAll() {
        return estimateRepository.findAll();
    }

    @Override
    public Iterable<Estimate> findUserByName() {
        return null;
    }
}
