package com.github.lych.discoverysentenceclient.domain.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BaseClientService implements ClientService {

    private final DiscoveryClient client;

    @Value("${spring.application.name}")
    private String name;

    @Override
    public List<ServiceInstance> getClients() {
        final List<String> clientKeys = getClientKeys();

        return clientKeys.stream()
                .map(client::getInstances)
                .flatMap(Collection::stream)
                .collect(toList());
    }

    private List<String> getClientKeys() {
        return client.getServices().stream()
                .filter(key -> !key.equals(name))
                .collect(toList());
    }
}
