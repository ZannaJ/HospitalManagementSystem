package com.company.patients;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Patients {
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
        int personal_code = scanner.nextInt();

        System.out.println("Enter the diagnose of the patient: ");
        String diagnose = scanner.next();





    }
}
