package com.github.lych.discoverysentenceclient.domain.service;

import com.github.lych.discoverysentenceclient.domain.model.Word;

import java.util.List;

public interface WordService {

    List<Word> getAll();

    Word getRandomWord();
}
