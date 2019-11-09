package br.com.squadjoaquina.errorlogger.service.exception;

public class ErrorAlreadyArchivedException extends RuntimeException {

    public ErrorAlreadyArchivedException() {
    }

    public ErrorAlreadyArchivedException(String message) {
        super(message);
    }
}
