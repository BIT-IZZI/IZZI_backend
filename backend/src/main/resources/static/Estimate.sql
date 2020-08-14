CREATE TABLE estimate
(
    `id`    INT NOT NULL AUTO_INCREMENT,
    `moving_to` VARCHAR(45) ,
    `moving_from` VARCHAR(45)  ,
    `moving_type` VARCHAR(45)  ,
    `square` VARCHAR(45) ,
    `moving_date`    VARCHAR(45)    ,
    `phone_number` VARCHAR(45) ,
    `name` VARCHAR(45) ,
    PRIMARY KEY (id)
);