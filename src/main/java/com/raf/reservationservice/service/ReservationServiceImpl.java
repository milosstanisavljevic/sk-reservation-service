package com.raf.reservationservice.service;

import com.raf.reservationservice.domain.Recenzija;
import com.raf.reservationservice.domain.Reservation;
import com.raf.reservationservice.dto.RecenzijaCreateDto;
import com.raf.reservationservice.dto.ReservationCreateDto;
import com.raf.reservationservice.repository.RecenzijaRepository;
import com.raf.reservationservice.repository.ReservationRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ReservationServiceImpl implements ReservationService{

    private ReservationRepository reservationRepository;
    private RecenzijaRepository recenzijaRepository;
    private RestTemplate userServiceRestTemplate;

    public ReservationServiceImpl(ReservationRepository reservationRepository, RestTemplate userServiceRestTemplate) {
        this.reservationRepository = reservationRepository;
        this.userServiceRestTemplate = userServiceRestTemplate;
    }

    @Override
    public void addReservation(ReservationCreateDto reservationCreateDto) {
        Reservation reservation = new Reservation();
        reservation.setPricePerDay(reservationCreateDto.getPricePerDay());
        reservation.setRoomType(reservationCreateDto.getRoomType());
        reservation.setUserId(reservationCreateDto.getUserId());
        reservationRepository.save(reservation);
        System.out.println("uspesno dodata rezervacija");
    }

    @Override
    public void addRecenzija(RecenzijaCreateDto recenzijaCreateDto) {
        Recenzija recenzija = new Recenzija(recenzijaCreateDto.getUserId(),
                recenzijaCreateDto.getOcena(),
                recenzijaCreateDto.getKratakOpis());
        recenzijaRepository.save(recenzija);
        System.out.println("uspesno dodata recenzija");

    }
}
