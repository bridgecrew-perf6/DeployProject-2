package com.itconsulting.mentalHealth.resource;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class AffirmationResource {

    private Long id;


    private String message;


    private String dayOfTheWeek;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private Date affirmationDate;
}
