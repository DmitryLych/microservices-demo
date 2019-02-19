package com.github.lych.client.domain.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BaseWordService implements WordService {

    @Value("${lucky-word}")
    private String luckyWord;

    @Override
    public String getWord() {
        return luckyWord;
    }
}
