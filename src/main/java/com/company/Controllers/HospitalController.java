package com.company.Controllers;

import com.company.dbhelper.DbConnection;
import com.company.objects.Patients;

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


        try {
            ps = DbConnection.getConnection().prepareStatement("INSERT INTO patients(name, surname, personal_code, age, gender)" + "VALUES('" + name + "', '" + surname + "', " + personalCode + ", " + age + ", '" + gender + "')");
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

    public static void editPatient() {
        System.out.println("Enter the patient id: ");
        int patientId = scanner.nextInt();

        System.out.println("name, surname, age, gender");
        System.out.println("Enter the field you want to edit: ");
        String field = scanner.next();

        System.out.println("Enter the updated value: ");
        String update = scanner.next();
        try {
            ps = DbConnection.getConnection().prepareStatement("UPDATE patients SET " + field + " = " + update + " WHERE id = " + patientId);
            ps.execute();
            System.out.println("Successfully updated patient. ");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static void deletePatient() {
        System.out.println("Enter patient id: ");
        int patientId = scanner.nextInt();

        try {
//            ps = DbConnection.getConnection().prepareStatement("DELETE FROM doctors WHERE patient_id=" + patientId);
            ps.execute();
            ps = DbConnection.getConnection().prepareStatement("DELETE FROM patients WHERE id=" + patientId);
            ps.execute();
            System.out.println("Successfully deleted");
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    public static Patients getPatientById() {

        // Prompt the user to enter the id of the student they want to retrieve.

        System.out.println("Enter the id of the patient: ");
        int id = scanner .nextInt();

        try {
            ps = DbConnection.getConnection().prepareStatement("SELECT * FROM patients WHERE id=" + id);
            rs = ps.executeQuery();

            int patientId, age, personalCode;
            String name, surname, gender;
            Patients patients = new Patients();

            while (rs.next()) {
                patientId = rs.getInt("id");
                name = rs.getString("name");
                surname = rs.getString("surname");
                gender = rs.getString("gender");
                age = rs.getInt("age");
                personalCode = rs.getInt("personalCode");
                patients.setId(patientId);
                patients.setName(name);
                patients.setSurname(surname);
                patients.setAge(age);
                patients.setGender(gender);
                patients.setPersonalCode(personalCode);
                System.out.println(patientId + "\t " + name + "\t " + surname + "\t " + age + "\t " + gender + "\t " + personalCode + "\t ");

            }
            return patients;


        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void drugsToPatients() {
        System.out.println("Enter the patient's id: ");
        int id = scanner.nextInt();

        System.out.println("Enter the name of the drug : ");
        String drugName = scanner.next();


        try {
            ps = DbConnection.getConnection().prepareStatement("INSERT INTO drugs (name, patient_id) VALUES('" + drugName + "',"  + id + ")");
            ps.execute();
            System.out.println("Successfully assigned drugs to patient.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
