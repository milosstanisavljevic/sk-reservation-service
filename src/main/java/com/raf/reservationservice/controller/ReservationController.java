package com.raf.reservationservice.controller;

import com.raf.reservationservice.domain.Termin;
import com.raf.reservationservice.dto.HotelCreateDto;
import com.raf.reservationservice.dto.RecenzijaCreateDto;
import com.raf.reservationservice.dto.ReservationCreateDto;
import com.raf.reservationservice.service.ReservationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }


    @PostMapping("/add")
    public ResponseEntity<Void> addReservation(@RequestBody @Valid ReservationCreateDto reservationCreateDto) {
        reservationService.addReservation(reservationCreateDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PostMapping("/recenzija")
    public ResponseEntity<Void> addRecenzija(@RequestBody RecenzijaCreateDto recenzijaCreateDto){
        reservationService.addRecenzija(recenzijaCreateDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PostMapping("/dodavanjeHotela")
    public ResponseEntity<Void> addHotel(@RequestBody HotelCreateDto hotelCreateDto){
        reservationService.addHotel(hotelCreateDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("/otkaziRezervaciju/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        reservationService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/listaTermina")
    public ResponseEntity<Page<Termin>> findAll(Pageable pageable) {
        return new ResponseEntity<>(reservationService.findAll(pageable), HttpStatus.OK);
    }

}
