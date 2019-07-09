package com.plato.eurekaclient.model;

public enum Sex {
    MALE("0"),
    FEMALE("1");

    private String code;

    Sex(String code) {
        this.code = code;
    }

    public String getCode(){
        return code;
    }
}
