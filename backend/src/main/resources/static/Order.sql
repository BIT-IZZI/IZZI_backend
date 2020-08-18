CREATE TABLE order
(
    `id`    INT NOT NULL AUTO_INCREMENT,
     `order_date` VARCHAR(45) ,
     `moving_date`    VARCHAR(45)    ,
     `moving_type` VARCHAR(45)  ,
     `moving_price` VARCHAR(45)  ,
     `payment_status` VARCHAR(45)  ,
     `payment_method` VARCHAR(45)  ,
     `payment_date` VARCHAR(45)  ,
    `square` VARCHAR(45) ,
    `moving_to` VARCHAR(45) ,
    `moving_from` VARCHAR(45)  ,
    `phone_number` VARCHAR(45) ,
    `name` VARCHAR(45) ,
    PRIMARY KEY (id),
);