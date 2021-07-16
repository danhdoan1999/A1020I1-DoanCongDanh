package com.example.exception;

public class CustomerNotFoundException extends Exception {

    public String getMessage(){
        return "Error not found Customer";
    }
}
