package com.team.web.order;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "orderlist")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name="order_date") private LocalDate orderDate;
    @Column(name= "moving_date") private LocalDate movingDate;
    @Column(name= "moving_type") private String movingType;
    @Column(name= "moving_price") private String movingPrice;
    @Column(name= "payment_status") private String paymentStatus;
    @Column(name= "payment_method") private String paymentMethod;
    @Column(name= "payment_date") private LocalDate paymentDate;
    @Column (name="square") private String square;
    @Column (name="moving_to") private String movingTo;
    @Column (name="moving_from") private String movingFrom;
    @Column (name="phone_number") private String phoneNumber;
    @Column (name="name") private String name;

    @Builder
    private Order(LocalDate orderDate,
                  String movingPrice,
                  String paymentStatus,
                  String paymentMethod,
                  LocalDate paymentDate,
                  String movingType,
                  LocalDate movingDate,
                  String square,
                  String movingTo,
                  String movingFrom, String movingName, String phoneNumber){
        this.movingType= movingType;
        this.movingDate= movingDate;
        this.square= square;
        this.movingTo=movingTo;
        this.movingFrom=movingFrom;
        this.phoneNumber=phoneNumber;
        this.name=name;
        this.orderDate=orderDate;
        this.movingPrice=movingPrice;
        this.paymentStatus=paymentStatus;
        this.paymentMethod=paymentMethod;
        this.paymentDate=paymentDate;


    }
}
