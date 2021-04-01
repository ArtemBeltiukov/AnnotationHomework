package model;

import annotation.Secured;

public class Entity {

    private String name;
    private int value;

    public Entity(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    @Secured(secureLevel = 1)
    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    @Secured(secureLevel = 1, type = "not strict")
    public void setValue(int value) {
        this.value = value;
    }
}
