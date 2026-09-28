package com.eventsam.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eventsam.backend.entity.RSVP;

public interface RSVPRepository extends JpaRepository<RSVP, Long> {

}