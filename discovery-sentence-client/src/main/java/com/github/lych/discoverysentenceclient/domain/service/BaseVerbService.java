package com.github.lych.discoverysentenceclient.domain.service;

import com.github.lych.discoverysentenceclient.domain.model.Word;
import com.github.lych.discoverysentenceclient.domain.repository.VerbRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BaseVerbService extends AbstractWordService {

    private final VerbRepository repository;

    @Override
    @HystrixCommand(fallbackMethod = "getFallbackWords")
    public List<Word> getAll() {
        return repository.getWords();
    }

    @Override
    @HystrixCommand(fallbackMethod = "getFallbackWord")
    public Word getRandomWord() {
        return repository.getRandomWord();
    }
}
