package com.team.web.order;

import com.team.web.user.User;
import com.team.web.user.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.team.web.common.JpaService;
import java.util.Optional;

@Component
interface OrderService extends JpaService<Order> {
    Optional<Order> estiFirst(Order order);
    Order saveEstiFirst(User user, Order order);
}
@Service
public class OrderServiceImpl implements OrderService {
    private final UserRepository userRepository;
    private final OrderRepository orderRepository;

    public OrderServiceImpl(UserRepository userRepository, OrderRepository orderRepository) {
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public Optional<Order> estiFirst(Order order) {
        Optional<User> user = userRepository.findByUserId(order.getUser().getUserId());

        Order createOrder=new Order();
        createOrder.setMovingName(order.getMovingName());
        createOrder.setMovingDate(order.getMovingDate());
        createOrder.setMovingFrom(order.getMovingFrom());
        createOrder.setMovingTo(order.getMovingTo());
        createOrder.setMovingPhone(order.getMovingPhone());
        createOrder.setMovingType(order.getMovingType());
        createOrder.setOptionalAddrFrom(order.getOptionalAddrFrom());
        createOrder.setOptionalAddrTo(order.getOptionalAddrTo());
        createOrder.setMovingDetail(order.getMovingDetail());
        createOrder.setMovingWriter(order.getMovingWriter());
        createOrder.setSquare(order.getSquare());
        createOrder.setUser(user.get());



        System.out.println(createOrder);

        Order orderData=orderRepository.save(createOrder);
        return Optional.of(orderData);
    }

    @Override
    public Order saveEstiFirst(User user, Order order) {
        Order createOrder = new Order();
        createOrder.setMovingName(order.getMovingName());
        createOrder.setMovingDate(order.getMovingDate());
        createOrder.setMovingFrom(order.getMovingFrom());
        createOrder.setMovingTo(order.getMovingTo());
        createOrder.setMovingPhone(order.getMovingPhone());
        createOrder.setMovingType(order.getMovingType());
        createOrder.setOptionalAddrFrom(order.getOptionalAddrFrom());
        createOrder.setOptionalAddrTo(order.getOptionalAddrTo());
        createOrder.setMovingDetail(order.getMovingDetail());
        createOrder.setMovingWriter(order.getMovingWriter());
        createOrder.setSquare(order.getSquare());
        createOrder.setUser(user);
        return orderRepository.save(createOrder);
    }

    @Override
    public Iterable<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> findById(String id) {
        return orderRepository.findById(Long.valueOf(id));
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
