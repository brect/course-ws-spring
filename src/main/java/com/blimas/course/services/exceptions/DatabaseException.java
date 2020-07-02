package com.blimas.course.services.exceptions;

public class DatabaseException extends RuntimeException{

    private static final long serialVersionUID = 8853885942113138260L;

    public DatabaseException(String message){
        super(message);
    }
}
