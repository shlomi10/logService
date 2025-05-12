package com.ezbob.shuffle_log.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {

    @PostMapping
    public ResponseEntity<Void> logRequest(@RequestBody InputNumber request) {
        System.out.println("LOG: " + request);
        return ResponseEntity.ok().build();
    }
}

