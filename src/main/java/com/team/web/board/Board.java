package com.team.web.board;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="board_id") private Long boardId;
    @Column(name="notice", nullable=false) private String  notice;
    @Column(name="market", nullable=false) private String  market;
    @Column(name="review" ,nullable=false) private String  review;
    @Column(name="contact" ,nullable=false) private String  contact;


    @Builder
    private Board(
            String notice,
            String market,
            String review,
            String contact

    ){

        this.notice= notice;
        this.market= market;
        this.review= review;
        this.contact= contact;

    }
}
