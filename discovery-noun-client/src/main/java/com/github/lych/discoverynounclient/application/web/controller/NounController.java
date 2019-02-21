package com.github.lych.discoverynounclient.application.web.controller;

import com.github.lych.discoverynounclient.domain.service.NounService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class NounController {

    private final NounService service;

    @GetMapping("/")
    public ResponseEntity<List<String>> getNouns() {
        return ResponseEntity.ok(service.getNouns());
    }
}
