package cl.jesu.api.web.rest.errors;


import cl.jesu.api.web.rest.errors.exceptions.BadRequestException;
import cl.jesu.api.web.rest.errors.exceptions.NotFoundDataException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.io.IOException;

@ControllerAdvice
public class RestExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(RestExceptionHandler.class);

    @ExceptionHandler(NoHandlerFoundException.class)
    @RequestMapping(produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public
    @ResponseBody
    ErrorResponse requestHandlingNoHandlerFound(NoHandlerFoundException ex) {
        return new ErrorResponse(HttpStatus.NOT_FOUND.value(), "not_found", ex.getMessage());
    }

    @ExceptionHandler({Exception.class})
    @RequestMapping(produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public
    @ResponseBody
    ErrorResponse handleUncaughtException(Exception ex) throws IOException {
        logger.error("handleUncaughtException", ex);
        return new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "internal_error", ErrorConstants.INTERNAL_SERVER_ERROR);
    }


    @RequestMapping(produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ExceptionHandler({MissingServletRequestParameterException.class,
        UnsatisfiedServletRequestParameterException.class,
        ServletRequestBindingException.class,
        HttpMessageNotReadableException.class
    })
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public
    @ResponseBody
    ErrorResponse handleRequestException(Exception ex) {
        logger.error("handleUncaughtException", ex);
        return new ErrorResponse(HttpStatus.BAD_REQUEST.value(), "bad_request", ErrorConstants.BAD_REQUEST_ERROR);
    }


    @RequestMapping(produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    @ResponseStatus(value = HttpStatus.METHOD_NOT_ALLOWED)
    public
    @ResponseBody
    ErrorResponse handleMethodNotSupported(Exception ex) {
        logger.error("handleUncaughtException", ex);
        return new ErrorResponse(HttpStatus.METHOD_NOT_ALLOWED.value(), "method_not_allowed", ErrorConstants.METHOD_ERROR);
    }

    @RequestMapping(produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    @ResponseStatus(value = HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    public
    @ResponseBody
    ErrorResponse handleUnsupportedMediaTypeException(HttpMediaTypeNotSupportedException ex) {
        logger.error("handleUncaughtException", ex);
        return new ErrorResponse(HttpStatus.UNSUPPORTED_MEDIA_TYPE.value(), "unsupported_media_type", ErrorConstants.CONTENT_TYPE_ERROR);
    }

    @RequestMapping(produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ExceptionHandler(NotFoundDataException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public
    @ResponseBody
    ErrorResponse handleUnsupportedMediaTypeException(NotFoundDataException ex){
        return new ErrorResponse(HttpStatus.NOT_FOUND.value(), "not_found", ex.getMessage());
    }

    @RequestMapping(produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public
    @ResponseBody
    ErrorResponse handleUnsupportedProductTypeException(BadRequestException ex){
        return new ErrorResponse(HttpStatus.BAD_REQUEST.value(), "bad_request", ex.getMessage());
    }

    /*
     * TODO: Here add your own exceptions
     */

}
