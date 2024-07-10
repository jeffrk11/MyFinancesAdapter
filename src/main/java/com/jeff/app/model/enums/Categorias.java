package com.jeff.app.model.enums;

public enum Categorias {
    MORADIA("Moradia");

    private String name;

    Categorias(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
