package com.team.web.izzifile;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.function.Consumer;
import com.team.web.common.FileHandler;
 import com.team.web.common.Path;
import org.springframework.web.bind.annotation.*;
 import org.springframework.web.multipart.MultipartFile;
import java.util.function.Consumer;

@AllArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/izzifile")
public class IzziFileController {
    private static final Logger logger = LoggerFactory.getLogger(IzziFileController.class);
    @Autowired
    FileHandler fileHandler;
    @Autowired IzziFileServiceImpl izziFileServiceImpl;
/*    @Autowired IzziFile file;*/
    private final IzziFileRepository izziFileRepository;

    @PostMapping("/imageUpload/{uploadId}")
    public String uploadedImageFiles(@RequestParam("file") MultipartFile mfile, @PathVariable String uploadId) {
        logger.info("이미지 업로드 접속 성공 :: "+ uploadId);
        IzziFile file = new IzziFile();
        file.setUploadId(uploadId);
        String uploadFolder = Path.UPLOAD_PATH.toString();
        fileHandler.uploadImageFile(mfile, uploadFolder);
        Consumer<IzziFile> c = t->izziFileServiceImpl.save(file);
        c.accept(file);
        return "파일 업로드 성공 !!";
    }





}
