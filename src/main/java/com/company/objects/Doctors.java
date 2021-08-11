package com.company.objects;

public class Doctors {
    private int id;
    private String name;
    private String surname;
    private String speciality;


    public Doctors() {

    }
    public Doctors(int id, String name, String surname, String speciality){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
