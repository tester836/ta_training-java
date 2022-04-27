package com.epam.training.anton_pashutkin.exceptions.exception;

public class UniversityWithoutFacultiesException extends Exception {
    public UniversityWithoutFacultiesException() {
    }

    public UniversityWithoutFacultiesException(String message) {
        super(message);
    }

    public UniversityWithoutFacultiesException(String message, Throwable cause) {
        super(message, cause);
    }

    public UniversityWithoutFacultiesException(Throwable cause) {
        super(cause);
    }
}
