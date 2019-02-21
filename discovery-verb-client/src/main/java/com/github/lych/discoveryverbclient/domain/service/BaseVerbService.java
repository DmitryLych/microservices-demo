package com.github.lych.discoveryverbclient.domain.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseVerbService implements VerbService {

    @Value("${words}")
    private List<String> verbs;

    @Override
    public List<String> getVerbs() {
        return verbs;
    }
}
