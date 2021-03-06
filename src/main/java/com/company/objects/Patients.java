package com.company.objects;

public class Patients {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String gender;
    private int personal_code;


    public Patients() {

    }

    public Patients(int id, String name, String surname, int age, int personalCode) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personal_code = personal_code;
        this.gender = gender;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPersonalCode() {
        return personal_code;
    }

    public void setPersonalCode(int personalCode) {
        this.personal_code = personal_code;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
