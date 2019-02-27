package com.github.lych.discoverysentenceclient.domain.manager;

import com.github.lych.discoverysentenceclient.domain.model.Word;
import com.github.lych.discoverysentenceclient.domain.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BaseSentenceManager implements SentenceManager {

    private final List<WordService> services;

    @Override
    public List<Word> generateFromAllWords() {
        return services.stream()
                .map(WordService::getAll)
                .flatMap(Collection::stream)
                .collect(toList());
    }

    @Override
    public List<Word> generateFromRandomWords() {
        return services.stream()
                .map(WordService::getRandomWord)
                .collect(toList());
    }
}
