package com.team.web.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
interface OrderService{
    Optional<Order> estiFirst(Order order);
}
@Service
public class OrderServiceImpl implements OrderService {
   @Autowired OrderRepository orderRepository;

    @Override
    public Optional<Order> estiFirst(Order order) {
        Order createOrder=new Order();
        createOrder.setMovingName(order.getMovingName());
        createOrder.setMovingDate(order.getMovingDate());
        createOrder.setMovingFrom(order.getMovingFrom());
        createOrder.setMovingTo(order.getMovingTo());
        createOrder.setMovingPhone(order.getMovingPhone());
        createOrder.setMovingType(order.getMovingType());
        createOrder.setOptionalAddrFrom(order.getOptionalAddrFrom());
        createOrder.setOptionalAddrTo(order.getOptionalAddrTo());
        System.out.println(createOrder);

        Order orderData=orderRepository.save(createOrder);
        return Optional.of(orderData);
    }
}
