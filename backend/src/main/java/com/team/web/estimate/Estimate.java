package com.team.web.estimate;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "estimate")

public class Estimate {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)  // 기본키를 자동생성하고자 할떄 IDENTITY : 기본 키 생성을 데이터베이스에 위임하고자 할 때
    private Long id;
    @Column(name= "moving_type") private String movingType;
    @Column (name="moving_date") private LocalDate movingDate;
    @Column (name="square") private Integer square;
    @Column (name="moving_to") private String movingTo;
    @Column (name="moving_from") private String movingFrom;
    @Column (name="phoneNumber") private String phoneNumber;
    @Column (name="name") private String name;
}
