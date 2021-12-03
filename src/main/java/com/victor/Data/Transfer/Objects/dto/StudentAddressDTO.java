package com.victor.Data.Transfer.Objects.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Data
@ToString
public class StudentAddressDTO {

    private Long studentId;
    private String firstName;
    private String lastName;
    private String username;
    private String phoneNumber;
    private String country;
    private String state;
    private String city;
    private  String zipCode;
}
