package com.company.objects;

public class Diagnosis {
    private int id;
    private String diagnose;

    public Diagnosis(){

    }
    public Diagnosis(int id, String diagnose) {
        this.id = id;
        this.diagnose = diagnose;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }
}
