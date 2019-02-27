package com.github.lych.discoverysentenceclient.domain.repository;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("VERB")
public interface VerbRepository extends Repository {
}
