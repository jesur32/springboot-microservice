package cl.jesu.api.web.rest.errors;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse {

    private Integer code;
    private String error;
    @JsonProperty("error_description")
    private String errorDescription;

    public ErrorResponse(Integer code, String error, String errorDescription) {
        this.code = code;
        this.error = error;
        this.errorDescription = errorDescription;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
