package com.github.lych.discoverysentenceclient.application.web.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class WordResponse implements Serializable {

    private static final long serialVersionUID = -4158926073323506215L;

    private String word;
}
