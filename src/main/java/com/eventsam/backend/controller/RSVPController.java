package com.eventsam.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventsam.backend.entity.RSVP;
import com.eventsam.backend.repository.RSVPRepository;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api/rsvps")
public class RSVPController {

    private final RSVPRepository rsvpRepository;

    public RSVPController(RSVPRepository rsvpRepository) {
        this.rsvpRepository = rsvpRepository;
    }

    @PostMapping
    public RSVP createRSVP(@RequestBody RSVP rsvp) {
        return rsvpRepository.save(rsvp);
    }

    @GetMapping
    public List<RSVP> getAllRSVPs() {
        return rsvpRepository.findAll();
    }
}