package com.github.lych.discoverysentenceclient.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Word implements Serializable {

    private static final long serialVersionUID = -3070859697507781040L;

    private String word;
}
