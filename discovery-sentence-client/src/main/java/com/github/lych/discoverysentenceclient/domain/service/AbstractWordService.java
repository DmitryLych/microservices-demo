package com.github.lych.discoverysentenceclient.domain.service;

import com.github.lych.discoverysentenceclient.domain.model.Word;

import java.util.List;

import static java.util.Collections.emptyList;

public abstract class AbstractWordService implements WordService {

    protected List<Word> getFallbackWords() {
        return emptyList();
    }

    protected Word getFallbackWord() {
        return new Word();
    }
}
