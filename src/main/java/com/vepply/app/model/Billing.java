package com.vepply.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "billings")
public class Billing {
    @Id
    private String id;

    @DBRef
    private String customerId;
    private Integer billAmount;
    private Date month;

}
