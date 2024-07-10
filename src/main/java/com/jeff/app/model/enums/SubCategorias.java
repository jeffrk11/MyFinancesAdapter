package com.jeff.app.model.enums;

public enum SubCategorias {
    OUTROS("Outros");

    private String name;

    SubCategorias(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
