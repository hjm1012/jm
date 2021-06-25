package com.cdu.domain;

public class Person {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                '}';
    }
}
