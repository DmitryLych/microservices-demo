package com.github.lych.discoverysentenceclient.application.web.controller;


import com.github.lych.discoverysentenceclient.domain.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SentenceController {

    private final WordService wordService;

    @GetMapping("/sentence")
    public ResponseEntity<List<String>> getSentence() {
        return ResponseEntity.ok(wordService.getWords());
    }
}
