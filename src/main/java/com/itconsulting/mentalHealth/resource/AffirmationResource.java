package com.itconsulting.mentalHealth.resource;

import lombok.Data;

import java.util.Date;

@Data
public class AffirmationResource {

    private Long id;


    private String message;


    private String dayOfTheWeek;

    private Date affirmationDate;
}
