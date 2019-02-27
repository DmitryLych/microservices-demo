package com.github.lych.wordserver.domain.service;

import com.github.lych.wordserver.domain.model.Word;

import java.util.List;

public interface WordService {

    List<Word> getWords();

    Word getRandomWord();
}
