package com.github.lych.discoverysentenceclient.domain.repository;

import com.github.lych.discoverysentenceclient.domain.model.Word;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface Repository {

    @GetMapping("/")
    List<Word> getWords();

    @GetMapping("/random")
    Word getRandomWord();
}
