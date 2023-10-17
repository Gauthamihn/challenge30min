package com.example.demo30min.model;

public class Person {
    private long id;
    private String name;
    private String place;
    private int mobile;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public Person(long id, String name, String place, int mobile) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.mobile = mobile;
    }
}
