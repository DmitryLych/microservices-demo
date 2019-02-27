package com.github.lych.wordserver.application.web.controller;

import com.github.lych.wordserver.application.web.dto.WordResponse;
import com.github.lych.wordserver.domain.service.WordService;
import lombok.RequiredArgsConstructor;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class WordController {

    private final WordService service;
    private final Mapper mapper;

    @GetMapping("/")
    public ResponseEntity<List<WordResponse>> getWords() {
        final List<WordResponse> response = service.getWords().stream()
                .map(word -> mapper.map(word, WordResponse.class))
                .collect(toList());

        return ResponseEntity.ok(response);
    }

    @GetMapping("/random")
    public ResponseEntity<WordResponse> getRandomWord() {
        return ResponseEntity.ok(mapper.map(service.getRandomWord(), WordResponse.class));
    }
}
