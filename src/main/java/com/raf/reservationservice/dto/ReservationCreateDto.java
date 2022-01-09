package com.raf.reservationservice.dto;

import com.raf.reservationservice.domain.RoomType;

public class ReservationCreateDto {

    private Integer userId;
    private Double pricePerDay;
    private RoomType roomType;

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
}
