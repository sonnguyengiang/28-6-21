package com.company;

public class FileNotFoundException extends Exception{
    @Override
    public String getMessage() {
        return "file ko ton tai";
    }
}
