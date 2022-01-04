package com.raf.reservationservice.service;

import com.raf.reservationservice.dto.ReservationCreateDto;
import org.springframework.stereotype.Service;

@Service
public interface ReservationService {
    void addReservation(ReservationCreateDto reservationCreateDto);
}
