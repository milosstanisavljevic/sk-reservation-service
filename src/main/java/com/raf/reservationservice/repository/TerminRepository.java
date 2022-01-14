package com.raf.reservationservice.repository;

import com.raf.reservationservice.domain.Termin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TerminRepository extends JpaRepository<Termin,Integer> {
}
