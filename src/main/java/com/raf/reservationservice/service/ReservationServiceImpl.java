package com.raf.reservationservice.service;

import com.raf.reservationservice.domain.Hotel;
import com.raf.reservationservice.domain.Recenzija;
import com.raf.reservationservice.domain.Reservation;
import com.raf.reservationservice.domain.Termin;
import com.raf.reservationservice.dto.HotelCreateDto;
import com.raf.reservationservice.dto.RecenzijaCreateDto;
import com.raf.reservationservice.dto.ReservationCreateDto;
import com.raf.reservationservice.repository.HotelRepository;
import com.raf.reservationservice.repository.RecenzijaRepository;
import com.raf.reservationservice.repository.ReservationRepository;
import com.raf.reservationservice.repository.TerminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ReservationServiceImpl implements ReservationService{

    private ReservationRepository reservationRepository;
    private RecenzijaRepository recenzijaRepository;
    private TerminRepository terminRepository;
    private HotelRepository hotelRepository;
    private RestTemplate userServiceRestTemplate;

    public ReservationServiceImpl(ReservationRepository reservationRepository,TerminRepository terminRepository,HotelRepository hotelRepository, RestTemplate userServiceRestTemplate) {
        this.reservationRepository = reservationRepository;
        this.userServiceRestTemplate = userServiceRestTemplate;
        this.terminRepository = terminRepository;
        this.hotelRepository = hotelRepository;
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

    @Override
    public void addHotel(HotelCreateDto hotelCreateDto) {
        Hotel hotel = new Hotel(hotelCreateDto.getName(),
                hotelCreateDto.getShortDescription(),
                hotelCreateDto.getNumberOfRooms());
        hotelRepository.save(hotel);
        System.out.println("dodat hotel");
    }

    @Override
    public void deleteById(Integer id) {
        reservationRepository.deleteById(id);
        System.out.println("obrisana rezervacija");
    }

    @Override
    public Page<Termin> findAll(Pageable pageable) {
         return terminRepository.findAll(pageable);
    }
}
