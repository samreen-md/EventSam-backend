package com.eventsam.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eventsam.backend.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}