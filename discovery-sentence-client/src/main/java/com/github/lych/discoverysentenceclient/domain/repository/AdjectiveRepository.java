package com.github.lych.discoverysentenceclient.domain.repository;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("ADJECTIVE")
public interface AdjectiveRepository extends Repository {
}
