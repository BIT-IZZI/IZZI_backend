CREATE TABLE article
(
    `article_id`    INT NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(45)  ,
    `contents` VARCHAR(45)  ,
    `writer` VARCHAR(45)  ,
    `reg_date` VARCHAR(45)  ,
    `image` VARCHAR(45)  ,
    `video` VARCHAR(45)  ,
    `com_contents` VARCHAR(45)  ,
    `com_writer` VARCHAR(45) ,
    `com_reg_date` VARCHAR(45),
    `address` VARCHAR(45),

        PRIMARY KEY (article_id)
);