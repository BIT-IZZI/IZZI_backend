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
    @Column(name= "order_id")
    private Long orderId;
    @Column (name="order_date") private LocalDate orderDate;
    @Column(name= "moving_date") private LocalDate movingDate;
    @Column(name= "moving_type") private String movingType;
    @Column(name= "moving_price") private String movingPrice;
    @Column(name= "payment_status") private String paymentStatus;
    @Column(name= "payment_method") private String paymentMethod;
    @Column(name= "payment_date") private LocalDate paymentDate;
    @Column (name="square") private Integer square;
    @Column (name="moving_to") private String movingTo;
    @Column (name="moving_from") private String movingFrom;
    @Column (name="moving_phone") private String movingPhone;
    @Column (name="moving_name") private String movingName;
    @Column (name="optional_addr_to") private String optionalAddrTo;
    @Column (name="optional_addr_from") private String optionalAddrFrom;

a
    @Builder
    private Order(LocalDate orderDate,
                  String movingPrice,
                  String paymentStatus,
                  String paymentMethod,
                  LocalDate paymentDate,
                  String movingType,
                  LocalDate movingDate,
                  Integer square,
                  String movingTo,
                  String movingFrom,
                  String movingName,
                  String movingPhone,
                    String optionalAddrTo,
                  String optionalAddrFrom
                  ){
    this.optionalAddrFrom=optionalAddrFrom;
    this.optionalAddrTo=optionalAddrTo;
        this.movingType= movingType;
        this.movingDate= movingDate;
        this.square= square;
        this.movingTo=movingTo;
        this.movingFrom=movingFrom;
        this.movingPhone=movingPhone;
        this.movingName=movingName;
        this.orderDate=orderDate;
        this.movingPrice=movingPrice;
        this.paymentStatus=paymentStatus;
        this.paymentMethod=paymentMethod;
        this.paymentDate=paymentDate;


    }
}
