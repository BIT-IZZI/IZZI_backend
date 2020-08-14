package com.team.web.dummy;

import com.team.web.estimate.Estimate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dummy")
public class DummyController {
    @Autowired DummyService dummyService;

    @PostMapping("/estimate")
    public ResponseEntity<List<Estimate>> createRandomEstimate(){
        List<Estimate> randomEstimateList= dummyService.createRandomEstimate();
        return ResponseEntity.ok(randomEstimateList);
    }
}
