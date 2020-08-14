CREATE TABLE estimate
(
    `id`    INT NOT NULL AUTO_INCREMENT,
    `moving_type` VARCHAR(45) NOT NULL ,
    `square` VARCHAR(45) NOT NULL ,
    `moving_to` VARCHAR(45) NOT NULL ,
    `moving_from` VARCHAR(45) NOT NULL ,
    `phoneNumber` VARCHAR(45) NOT NULL ,
    `name` VARCHAR(45) NOT NULL ,
        PRIMARY KEY (id)
);