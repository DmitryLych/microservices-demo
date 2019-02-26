package com.github.lych.wordserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordController {

    @Value("${words}")
    private List<String> words;

    @GetMapping("/")
    public ResponseEntity<List<String>> getWords() {
        return ResponseEntity.ok(words);
    }
}
