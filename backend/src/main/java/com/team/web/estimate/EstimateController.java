package com.team.web.estimate;

import com.team.web.common.Box;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/estimates")
@AllArgsConstructor
public class EstimateController {
    private final EstimateService estimateService;
    static Logger logger = LoggerFactory.getLogger(EstimateController.class);
    @Autowired
    Box box;

    @GetMapping("/list")
    public Map<?,?> getAll(){
        Iterable<Estimate> estimateList = estimateService.findAll();
        box.put("list",estimateList);
        return box.get();
    }
    @GetMapping("/findUser/{id}")
    public Optional<Estimate> getOneUser(@PathVariable String id){
        System.out.println("자바확인" +id);
        return estimateService.findById(id);

    }
}
