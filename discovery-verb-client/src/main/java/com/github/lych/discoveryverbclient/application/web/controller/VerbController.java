package com.github.lych.discoveryverbclient.application.web.controller;

import com.github.lych.discoveryverbclient.domain.service.VerbService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class VerbController {

    private final VerbService service;

    @GetMapping("/")
    public ResponseEntity<List<String>> getVerbs() {
        return ResponseEntity.ok(service.getVerbs());
    }
}
