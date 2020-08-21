package com.team.web.order;
import com.team.web.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
    public ResponseEntity<Order> estiFirst(@RequestBody Order estiJsnon ){

        Optional<Order> estiFirst = orderService.estiFirst(estiJsnon);
        System.out.println("폼 :"+ estiJsnon.toString());
        if (estiFirst.isPresent()) {
            Order estimateInfo = estiFirst.get();
            return ResponseEntity.ok(estimateInfo);
        } else {
            return ResponseEntity.badRequest().build();
        }
    };
}

