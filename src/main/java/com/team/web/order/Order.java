package com.team.web.order;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.team.web.izzifile.IzziFileDB;
import com.team.web.user.User;
import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

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

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<IzziFileDB> izziFileDBList;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user")
    private User user;

    }
