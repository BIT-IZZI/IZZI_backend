package com.team.web.estimate;

import com.team.web.common.JpaService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
interface EstimateService extends JpaService<Estimate> {


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
    public Optional<Estimate> findById(String id) {
        return estimateRepository.findById(Long.valueOf(id));
    }

    @Override
    public int count() {
        return 0;
    }


    @Override
    public boolean exists(String id) {
        return false;
    }


}
