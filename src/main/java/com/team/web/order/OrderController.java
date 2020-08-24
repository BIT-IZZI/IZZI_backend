package com.team.web.order;
import com.team.web.common.Box;

import com.team.web.user.User;

import com.team.web.user.UserService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/orders")
@AllArgsConstructor
public class OrderController {
    private final OrderService orderService;

    private final UserService userService;

    static Logger logger = LoggerFactory.getLogger(OrderController.class);
    @Autowired
    Box box;
    @Autowired
    OrderRepository orderRepository;

    @PostMapping("/esitmateform/{userId}")
    public ResponseEntity<Order> estiFirst(@PathVariable String userId, @RequestBody Order estiJsnon ){
        User user = userService.findUserById(Long.parseLong(userId));
        Order newOne = orderService.saveEstiFirst(user, estiJsnon);

        return ResponseEntity.ok(newOne);
    };

    // Estimate fetch all
    @GetMapping("/list")
    public Map<?,?> getAll(){
        Iterable<Order> orderList = orderService.findAll();
        box.put("list",orderList);
        return box.get();
    }
    @GetMapping("/findUser/{id}")
    public Optional<Order> getOneUser(@PathVariable String id){
        System.out.println("자바확인" +id);
        return orderService.findById(id);

    }
}

