package com.raf.reservationservice.repository;

import com.raf.reservationservice.domain.Recenzija;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecenzijaRepository extends JpaRepository<Recenzija,Integer> {
}
