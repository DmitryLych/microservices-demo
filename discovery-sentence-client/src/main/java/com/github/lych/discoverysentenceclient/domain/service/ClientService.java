package com.github.lych.discoverysentenceclient.domain.service;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface ClientService {

    List<ServiceInstance> getClients();
}
