package com.team.web.estimate;

import com.team.web.common.Box;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
        logger.info("list()");
        Iterable<Estimate> estimateList = estimateService.findAll();
        box.put("list",estimateList);
        return box.get();
    }
    @GetMapping("/findUser")
    public Map<?,?> findUserByName(@PathVariable String name){
        logger.info("findUser()");
        Iterable<Estimate> estimateList= estimateService.findUserByName();
        box.put("findUser",estimateList);
        return box.get();
    }
}
