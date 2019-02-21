package com.github.lych.discoveryadjectiveclient.application.web.controller;

import com.github.lych.discoveryadjectiveclient.domain.service.AdjectiveService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AdjectivesController {

    private final AdjectiveService service;

    @GetMapping("/")
    public ResponseEntity<List<String>> getAdjectives() {
        return ResponseEntity.ok(service.getAdjectives());
    }
}
