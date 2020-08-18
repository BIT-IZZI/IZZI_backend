package com.team.web.estimate;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EstimatesVO {
    private String movingType;
    private LocalDate movingDate;
    private String square;
    private String movingTo;
    private String movingFrom;
    private String phoneNumber;
    private String name;
}
