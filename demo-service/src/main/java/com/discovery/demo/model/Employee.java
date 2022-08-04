package com.discovery.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Employee")
public class Employee {

    @BsonId
    private String id;

    private String firstName;

    private String lastName;

    private String emailId;
}
