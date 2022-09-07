package com.co.qvision.exceptions;

public class ExeptionUpdate extends RuntimeException{
    public ExeptionUpdate(String name){
        super("The name should " + name + " doesn´t equals with expected parameter");
    }
}
