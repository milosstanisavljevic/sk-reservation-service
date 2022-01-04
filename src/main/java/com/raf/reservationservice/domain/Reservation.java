package com.raf.reservationservice.domain;

import javax.persistence.*;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, columnDefinition = "int")
    private Integer userId;
    @Column
    private Double price;

}
