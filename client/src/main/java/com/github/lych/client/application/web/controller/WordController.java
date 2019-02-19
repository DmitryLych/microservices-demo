package com.github.lych.client.application.web.controller;

import com.github.lych.client.domain.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class WordController {

    private final WordService service;

    @GetMapping("/lucky-word")
    public ResponseEntity<String> getWord() {
        return ResponseEntity.ok(service.getWord());
    }
}
