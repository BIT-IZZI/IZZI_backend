package com.team.web.article;
import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;

@Entity @Getter @Setter @ToString @NoArgsConstructor
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="article_id") private Long articleId;
    @Column(name="title", nullable=false) private String  title;
    @Column(name="contents", nullable=false) private String  contents;
    @Column(name="writer" ,nullable=false) private String  writer;
    @Column(name="reg_date" ,nullable=false) private LocalDate regDate;
    @Column(name="image" ,nullable=false) private String  image;
    @Column(name="video" ,nullable=false) private String  video;
    @Column(name="com_contents" ,nullable=false) private String  comContents;
    @Column(name="com_reg_date" ,nullable=false) private LocalDate  comRegDate;
    @Column(name="com_writer" ,nullable=false) private String  comWriter;

    @Builder
    private Article(
                    String title,
                    String contents,
                    String writer,
                    LocalDate regDate,
                    String image,
                    String video,
                    String comContents,
                    LocalDate comRegDate,
                    String comWriter
                    ){

        this.title= title;
        this.contents= contents;
        this.writer= writer;
        this.regDate= regDate;
        this.image= image;
        this.video= video;
        this.comContents= comContents;
        this.comRegDate= comRegDate;
        this.comWriter= comWriter;
    }
}
