package com.example.customspringevent.myCustomEvent;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class CustomSpringEventListenerThird implements ApplicationListener<CustomSpringEvent> {
    @Override
    public void onApplicationEvent(CustomSpringEvent event) {
        log.info("CustomSpringEventListenerThird, Received spring Custom event: {}",event.getMessage());
    }
}
