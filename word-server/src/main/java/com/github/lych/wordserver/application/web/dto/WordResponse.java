package com.github.lych.wordserver.application.web.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class WordResponse implements Serializable {

    private static final long serialVersionUID = -1878176746648565191L;

    private String word;
}
