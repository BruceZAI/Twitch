package com.laioffer.poe.service;

public class TwitchException extends RuntimeException{
    public TwitchException(String errorMessage) {
        super(errorMessage);
    }
}
