package com.github.lych.discoveryadjectiveclient.domain.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseAdjectivesService implements AdjectiveService {

    @Value("${words}")
    private List<String> adjectives;

    @Override
    public List<String> getAdjectives() {
        return adjectives;
    }
}
