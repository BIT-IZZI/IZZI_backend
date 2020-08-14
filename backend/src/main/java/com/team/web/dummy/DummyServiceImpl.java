package com.team.web.dummy;

import com.team.web.estimate.Estimate;
import com.team.web.estimate.EstimateRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
interface DummyService{

    List<Estimate> createRandomEstimate();
}
@Service
public class DummyServiceImpl  implements  DummyService{
    private final EstimateRepository estimateRepository;
    public DummyServiceImpl(EstimateRepository estimateRepository){
        this.estimateRepository= estimateRepository;
    }
    @Override
    public List<Estimate> createRandomEstimate() {
        List<Estimate> estimateList= new ArrayList<>();
        for(int i=0; i<1000;i++){
            Estimate estimate= new Estimate();
            estimate.setMovingType(RandomEstimatesGenerator.generateRandomMovingType());
            estimate.setMovingDate(RandomEstimatesGenerator.generateRandomJoinDate());
            estimate.setPhoneNumber(RandomEstimatesGenerator.generateRandomPhone() +
                    RandomEstimatesGenerator.generateRandomPhoneNo()+RandomEstimatesGenerator.generateRandomPhoneNo());
            estimate.setName(RandomEstimatesGenerator.generateRandomName());
            estimate.setMovingFrom(RandomEstimatesGenerator.generateRandomAddress());
            estimateList.add(estimate);
        }
        return estimateRepository.saveAll(estimateList);
    }
}
