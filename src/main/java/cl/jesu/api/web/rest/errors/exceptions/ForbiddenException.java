package cl.jesu.api.web.rest.errors.exceptions;

public class ForbiddenException extends Exception {

    public ForbiddenException() {
        super("forbidden access");
    }
}
