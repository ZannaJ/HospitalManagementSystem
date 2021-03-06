package com.company.Menu;

import com.company.Controllers.HospitalController;

import java.util.Scanner;

public class Menu {

    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do now?");
        System.out.println("1. Get a patient by ID");
        System.out.println("2. Add a new patient");
        System.out.println("3. Add a new doctor ");
        System.out.println("4. Edit a patient");
        System.out.println("5. Delete a patient");
        System.out.println("6. Add a new drug");
        System.out.println("7. Edit a drug");

        System.out.println("Select an option: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                HospitalController.getPatientById();
                break;
            case 2:
                HospitalController.addNewPatient();
                break;
            case 3:
                HospitalController.addNewDoctor();
                break;
            case 4:
                HospitalController.editPatient();
                break;
            case 5:
                HospitalController.deletePatient();
                break;
            case 6:
                HospitalController.addNewDrugs();
                break;
            case 7:
                HospitalController.editDrug();
                break;
            default:
                System.out.println("Invalid option selected. ");
        }

    }
}