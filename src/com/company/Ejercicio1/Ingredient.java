package com.company.Ejercicio1;

public class Ingredient {
    private Integer id;
    private String name;
    private String origin;


    public Ingredient(Integer id, String name, String origin) {
        this.id = id;
        this.name = name;
        this.origin = origin;
    }

    public Ingredient(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
