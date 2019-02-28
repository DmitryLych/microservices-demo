package com.github.lych.client.domain.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class BaseSimpleWordService implements WordService {

    @Value("${word-config.simple-word}")
    private String word;

    @Override
    public String getWord() {
        return word;
    }
}

