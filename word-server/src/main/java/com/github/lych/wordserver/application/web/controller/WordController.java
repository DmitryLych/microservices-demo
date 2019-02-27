package com.github.lych.wordserver.application.web.controller;

import com.github.lych.wordserver.domain.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class WordController {

    private final WordService service;

    @GetMapping("/")
    public ResponseEntity<List<String>> getWords() {
        return ResponseEntity.ok(service.getWords());
    }
}
