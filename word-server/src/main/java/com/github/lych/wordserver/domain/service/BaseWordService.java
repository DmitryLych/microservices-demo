package com.github.lych.wordserver.domain.service;

import com.github.lych.wordserver.domain.model.Word;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

import static java.util.stream.Collectors.toList;

@Service
public class BaseWordService implements WordService {

    @Value("${words}")
    private List<String> words;

    @Override
    public List<Word> getWords() {
        return words.stream().map(Word::of).collect(toList());
    }

    @Override
    public Word getRandomWord() {
        return Word.of(words.get(new Random().nextInt(words.size())));
    }
}
