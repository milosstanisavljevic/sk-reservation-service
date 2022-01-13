package com.raf.reservationservice.repository;

import com.raf.reservationservice.domain.Recenzija;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecenzijaRepository extends JpaRepository<Recenzija,Long> {
}
