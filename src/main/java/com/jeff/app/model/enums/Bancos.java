package com.jeff.app.model.enums;

public enum Bancos {
    BPI("BPI"),
    REVOLUT("REVOLUT");

    private String name;

    Bancos(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
