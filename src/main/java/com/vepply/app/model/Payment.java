package com.vepply.app.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Payment {

    @Id
    private String id;
    private String customerId;
    private String billingId;
    private String paidAmount;
    private Date date;

}
