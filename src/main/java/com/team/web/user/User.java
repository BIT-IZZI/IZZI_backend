package com.team.web.user;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.team.web.board.Board;
import com.team.web.order.Order;
import com.team.web.statistics.Statistics;
import lombok.*;

import java.time.LocalDate;
import java.util.List;


@NoArgsConstructor(access=AccessLevel.PROTECTED)
@Getter
@Setter
@ToString
@Entity
@Table(name= "user", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id"})})
public class User {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)  // 기본키를 자동생성하고자 할떄 IDENTITY : 기본 키 생성을 데이터베이스에 위임하고자 할 때
    private Long id;
    @Column(name = "user_id") private String userId;
    @Column(name = "name") private String name;
    @Column(name = "password") private String password;
    @Column(name = "birth_date") private LocalDate birthDate;
    @Column(name = "gender") private String gender;
    @Column(name = "address") private String address;
    @Column(name = "latitude") private String latitude;
    @Column(name = "longitude") private String longitude;
    @Column(name = "email") private String email;
    @Column(name = "join_date") private LocalDate joinDate;
    @Column(name = "optional_addr") private String optionalAddr;
    @Column(name = "phone_number") private String phoneNumber;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Order> orderList;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Statistics> statistics;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Board> board;


}