package com.fatec.pablo.springtopicos20231.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class AutorizacaoNaoEncontradaException extends IllegalArgumentException {
    public AutorizacaoNaoEncontradaException() {
        super();
    }

    public AutorizacaoNaoEncontradaException(String message) {
        super(message);
    }
}
