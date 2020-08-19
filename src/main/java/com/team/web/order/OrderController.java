package com.team.web.order;
import com.team.web.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    OrderRepository orderRepository;

    @PostMapping("/esitmateform")
    public ResponseEntity<Order> estiFirst(@RequestBody Order order){
        Optional<Order> estiFirst = orderService.estiFirst(order);
        if (estiFirst.isPresent()) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    };
}

