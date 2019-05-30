package cl.jesu.api.web.rest.errors;

public final class ErrorConstants {

    public static final String INTERNAL_SERVER_ERROR = "Ha ocurrido un error interno en el servidor";
    public static final String BAD_REQUEST_ERROR = "Error al realizar la petición";
    public static final String METHOD_ERROR = "Metodo no soportado";
    public static final String CONTENT_TYPE_ERROR = "Content-type no soportado";

    private ErrorConstants() {
    }
}
