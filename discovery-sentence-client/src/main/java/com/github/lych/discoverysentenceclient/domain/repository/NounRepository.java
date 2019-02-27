package com.github.lych.discoverysentenceclient.domain.repository;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("NOUN")
public interface NounRepository extends Repository {
}
