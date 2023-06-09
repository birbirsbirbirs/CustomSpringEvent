package com.example.customspringevent.myCustomEvent;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomSpringEventPublisher {
    private final ApplicationEventPublisher applicationEventPublisher;

    public void publishCustomEvent(final String message){
        System.out.println("Publishing custom event.");
        CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, message);
        applicationEventPublisher.publishEvent(customSpringEvent);
    }
}
