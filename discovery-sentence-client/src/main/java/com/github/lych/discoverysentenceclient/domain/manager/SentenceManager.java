package com.github.lych.discoverysentenceclient.domain.manager;

import com.github.lych.discoverysentenceclient.domain.model.Word;

import java.util.List;

public interface SentenceManager {

    List<Word> generateFromAllWords();

    List<Word> generateFromRandomWords();
}
