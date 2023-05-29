package com.kafka.project.kafkaproject.controller;

import com.kafka.project.kafkaproject.domain.LibraryEvent;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryEventsController {

    @PostMapping("/v1/libraryevent")
    public ResponseEntity<LibraryEvent> postLibraryEvent(@RequestBody LibraryEvent libraryEvent){
        //invoke kafka producer
        return ResponseEntity.status(HttpStatus.CREATED).body(libraryEvent);
    }
}
