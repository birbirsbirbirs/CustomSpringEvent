package com.example.customspringevent.controller;

import com.example.customspringevent.myCustomEvent.CustomSpringEventPublisher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/event")
public class EventController {
    private final CustomSpringEventPublisher customSpringEventPublisher;

    @PostMapping
    public boolean publishMessage(@RequestBody String message) {
        customSpringEventPublisher.publishCustomEvent(message);
        return true;
    }
}
