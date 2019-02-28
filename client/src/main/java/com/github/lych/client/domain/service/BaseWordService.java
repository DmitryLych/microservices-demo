package com.github.lych.client.domain.service;

import com.github.lych.client.application.config.WordConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BaseWordService implements WordService {

    private final WordConfig config;

    @Override
    public String getWord() {
        return config.getLuckyWord();
    }
}
