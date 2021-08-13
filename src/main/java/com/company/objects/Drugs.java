package com.company.objects;

public class Drugs {
    private int id;
    private String name;
    private String for_what;

    public Drugs(){

    }
    public Drugs(int id, String name, String for_what) {
        this.id = id;
        this.name = name;
        this.for_what = for_what;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFor_what() {
        return for_what;
    }

    public void setFor_what(String for_what) {
        this.for_what = for_what;
    }
}
