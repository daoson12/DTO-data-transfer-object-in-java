package com.victor.Data.Transfer.Objects.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address_tbl")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addressId")
    private Long addressId;

    @Column(name = "country")
    private String country;

    @Column(name = "state")
    private String state;

    @Column(name="city")
    private String city;


    @Column(name = "zipCode")
    private  String zipCode;






}
