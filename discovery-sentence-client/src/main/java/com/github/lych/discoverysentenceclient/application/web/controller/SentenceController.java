package com.github.lych.discoverysentenceclient.application.web.controller;


import com.github.lych.discoverysentenceclient.application.web.dto.WordResponse;
import com.github.lych.discoverysentenceclient.domain.manager.SentenceManager;
import com.github.lych.discoverysentenceclient.domain.model.Word;
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
public class SentenceController {

    private final SentenceManager manager;
    private final Mapper mapper;

    @GetMapping("/sentence")
    public ResponseEntity<List<WordResponse>> getSentence() {
        return ResponseEntity.ok(prepareResponse(manager.generateFromRandomWords()));
    }

    @GetMapping("/all")
    public ResponseEntity<List<WordResponse>> getAll() {
        return ResponseEntity.ok(prepareResponse(manager.generateFromAllWords()));
    }

    private List<WordResponse> prepareResponse(final List<Word> words) {
        return words.stream()
                .map(word -> mapper.map(word, WordResponse.class))
                .collect(toList());
    }
}
