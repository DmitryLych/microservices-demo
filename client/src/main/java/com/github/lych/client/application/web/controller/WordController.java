package com.github.lych.client.application.web.controller;

import com.github.lych.client.domain.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class WordController {

    private final List<WordService> services;

    @GetMapping("/lucky-word")
    public ResponseEntity<List<String>> getWord() {
        return ResponseEntity.ok(services.stream().map(WordService::getWord).collect(toList()));
    }
}
