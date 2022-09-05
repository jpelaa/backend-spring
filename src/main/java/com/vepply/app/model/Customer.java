package com.vepply.app.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Document(collection = "customers")
public class Customer {
    @Id
    private String id;
    @NotBlank
    @Size(max = 20)
    private String name;
    @NotBlank
    @Size(max = 20)
    private String aadhaarNumber;
    @Size(max = 50)
    @Email
    private String email;
    @NotBlank
    @Size(max = 120)
    private String area;
    @NotBlank
    @Size(max = 120)
    private Integer phoneNumber1;
    @Size(max = 120)
    private Integer phoneNumber2;
    @Size(max = 120)
    private Integer addressId;

    @DBRef
    @Size(max = 120)
    private Integer packageId;
    @Size(max = 120)
    private String status;
    @Size(max = 120)
    private String addressProofNo;
    @Size(max = 120)
    private String addressProofType;
    @Size(max = 120)
    private String deviceBoxNo;

}
