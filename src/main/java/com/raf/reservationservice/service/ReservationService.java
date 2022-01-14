package com.raf.reservationservice.service;

import com.raf.reservationservice.domain.Termin;
import com.raf.reservationservice.dto.HotelCreateDto;
import com.raf.reservationservice.dto.RecenzijaCreateDto;
import com.raf.reservationservice.dto.ReservationCreateDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface ReservationService {
    void addReservation(ReservationCreateDto reservationCreateDto);
    void addRecenzija(RecenzijaCreateDto recenzijaCreateDto);
    void addHotel(HotelCreateDto hotelCreateDto);
    void deleteById(Integer id);
    Page<Termin> findAll(Pageable pageable);
}
