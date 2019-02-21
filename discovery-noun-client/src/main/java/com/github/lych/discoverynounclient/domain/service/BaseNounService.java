package com.github.lych.discoverynounclient.domain.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseNounService implements NounService {

    @Value("${words}")
    private List<String> nouns;

    @Override
    public List<String> getNouns() {
        return nouns;
    }
}
