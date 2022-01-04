package com.raf.reservationservice.domain;

import javax.persistence.*;

@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String shortDescription;
    private Integer numberOfRooms;
    //private RoomType roomType;
}
