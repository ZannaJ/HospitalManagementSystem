package com.company.Controllers;

import com.company.dbhelper.DbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HospitalController {

    static Scanner scanner = new Scanner(System.in);
    private static PreparedStatement ps;
    private static ResultSet rs;
    public static boolean addNewPatient() {
        System.out.println("Enter the name of the patient: ");
        String name = scanner.next();

        System.out.println("Enter the surname of the patient: ");
        String surname = scanner.next();

        System.out.println("Enter the age of the patient: ");
        int age = scanner.nextInt();

        System.out.println("Enter the gender of the patient: ");
        String gender = scanner.next();

        System.out.println("Enter the personal code of the patient: ");
        int personalCode = scanner.nextInt();

        System.out.println("Enter the diagnose of the patient: ");
        String diagnose = scanner.next();

        try {
            ps = DbConnection.getConnection().prepareStatement("INSERT INTO patients(name, surname, personal_code, diagnose, age, gender)" + "VALUES('" + name + "', '" + surname + "', " + personalCode + ", '" + diagnose + "', " + age + ", '" + gender + "')");
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }
    public static boolean addNewDoctor() {
        System.out.println("Enter the name of the doctor: ");
        String name = scanner.next();

        System.out.println("Enter the surname of the doctor: ");
        String surname = scanner.next();

        System.out.println("Enter the speciality of the doctor: ");
        String speciality = scanner.next();

        try {
            ps = DbConnection.getConnection().prepareStatement("INSERT INTO doctors(name, surname, speciality)" + "VALUES('" + name + "', '" + surname + "', '" + speciality + "')");
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }
    public static boolean addNewDrugs() {
        System.out.println("Enter the name of the drugs: ");
        String name = scanner.next();

        try {
            ps = DbConnection.getConnection().prepareStatement("INSERT INTO drugs(name)" + "VALUES('" + name + "')");
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static boolean addNewDiagnose() {
        System.out.println("Enter the diagnose: ");
        String diagnose = scanner.next();

        try {
            ps = DbConnection.getConnection().prepareStatement("INSERT INTO diagnosis(diagnose)" + "VALUES('" + diagnose + "')");
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static void editPatient() {
        System.out.println("Enter the patient id: ");
        int patientId = scanner.nextInt();

        System.out.println("name, surname, age, gender, diagnose");
        System.out.println("Enter the field you want to edit: ");
        String field = scanner.next();

        System.out.println("Enter the updated value: ");
        String update = scanner.next();
        try {
            ps = DbConnection.getConnection().prepareStatement("UPDATE students SET " + field + " = " + update + " WHERE id = " + patientId);
            ps.execute();
            System.out.println("Successfully updated patient. ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
