package com.github.lych.discoverysentenceclient.domain.repository;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("SUBJECT")
public interface SubjectRepository extends Repository {
}
