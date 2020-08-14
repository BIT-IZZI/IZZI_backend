package com.team.web.izzifile;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@Component
@Table(name="izzi_file")
public class IzziFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "file_id")
    private Long fileId;
    @Column(name = "file_type")
    private String fileType;
    @Column(name = "file_name")
    private String fileName;
    @Column(name = "file_date")
    private LocalDate fileDate;
    @Column(name = "file_size")
    private String fileSize;
    @Column(name="upload_id") private String uploadId;

    @Builder
    private IzziFile(String fileType, String fileName, LocalDate fileDate, String fileSize,String uploadId
    ) {
        this.fileType = fileType;
        this.fileName = fileName;
        this.fileDate = fileDate;
        this.fileSize = fileSize;
        this.uploadId=uploadId;

    }
}

