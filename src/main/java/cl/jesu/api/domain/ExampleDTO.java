package cl.jesu.api.domain;

import java.io.Serializable;

public class ExampleDTO implements Serializable {
    private String message;

    public ExampleDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
