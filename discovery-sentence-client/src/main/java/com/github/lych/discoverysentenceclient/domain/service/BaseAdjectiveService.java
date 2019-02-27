package com.github.lych.discoverysentenceclient.domain.service;

import com.github.lych.discoverysentenceclient.domain.model.Word;
import com.github.lych.discoverysentenceclient.domain.repository.AdjectiveRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BaseAdjectiveService implements WordService {

    private final AdjectiveRepository repository;

    @Override
    public List<Word> getAll() {
        return repository.getWords();
    }

    @Override
    public Word getRandomWord() {
        return repository.getRandomWord();
    }
}
