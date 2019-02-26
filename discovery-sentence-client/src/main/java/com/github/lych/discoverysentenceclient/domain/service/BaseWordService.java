package com.github.lych.discoverysentenceclient.domain.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BaseWordService implements WordService {

    private final ClientService clientService;
    private final RestTemplate restTemplate;

    @Override
    public List<String> getWords() {
        final List<ServiceInstance> instances = clientService.getClients();

        return instances.stream()
                .map(instance -> restTemplate.exchange("http://" + instance.getServiceId(), HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<String>>() {
                        }).getBody())
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .collect(toList());
    }
}
