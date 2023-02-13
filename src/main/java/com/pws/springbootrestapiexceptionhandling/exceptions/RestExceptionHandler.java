package com.pws.springbootrestapiexceptionhandling.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(value = NoProductFoundException.class)
    public ResponseEntity handleNoProductFoundException(){

        ApiError error=new ApiError(400,"No Poduct Found",new Date());

        return new ResponseEntity<ApiError>(error,HttpStatus.BAD_REQUEST);
    }
}
