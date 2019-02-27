package com.github.lych.wordserver.domain.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseWordService implements WordService {

    @Value("${words}")
    private List<String> words;

    @Override
    public List<String> getWords() {
        return words;
    }
}
