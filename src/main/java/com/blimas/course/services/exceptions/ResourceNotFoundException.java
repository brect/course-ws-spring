package com.blimas.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 5884300157556653203L;

    public ResourceNotFoundException(Object object){
        super("Resource not found. Id "  + object);
    }

}
