package com.vepply.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "packages")
public class Package {
    @Id
    private String id;
    private String name;
    private Integer amount;

}

