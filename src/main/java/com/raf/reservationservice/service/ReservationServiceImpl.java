package com.raf.reservationservice.service;

import com.raf.reservationservice.dto.ReservationCreateDto;
import com.raf.reservationservice.repository.ReservationRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ReservationServiceImpl implements ReservationService{

    private ReservationRepository reservationRepository;
    private RestTemplate userServiceRestTemplate;

    public ReservationServiceImpl(ReservationRepository reservationRepository, RestTemplate userServiceRestTemplate) {
        this.reservationRepository = reservationRepository;
        this.userServiceRestTemplate = userServiceRestTemplate;
    }

    @Override
    public void addReservation(ReservationCreateDto reservationCreateDto) {
            //dodavanje rezervacija
    }
}
