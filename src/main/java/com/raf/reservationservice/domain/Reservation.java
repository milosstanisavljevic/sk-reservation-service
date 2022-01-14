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
    private Double pricePerDay;
    @OneToOne
    private RoomType roomType;
    @OneToOne
    private Termin termin;
    public Reservation(){}

    public Reservation(Integer userId, Double pricePerDay, RoomType roomType,Termin termin) {
        this.userId = userId;
        this.pricePerDay = pricePerDay;
        this.roomType = roomType;
        this.termin = termin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Termin getTermin() {
        return termin;
    }

    public void setTermin(Termin termin) {
        this.termin = termin;
    }
}
