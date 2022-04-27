package com.epam.training.anton_pashutkin.exceptions.exception;

public class GradeOutOfRangeException extends Exception {
    public GradeOutOfRangeException() {
    }

    public GradeOutOfRangeException(String message) {
        super(message);
    }

    public GradeOutOfRangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public GradeOutOfRangeException(Throwable cause) {
        super(cause);
    }
}
