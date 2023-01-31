package src;

import src.Repository.PhoneRepository;
import src.Repository.PhoneRepositoryImpl;
import src.Repository.PhoneRepositoryMethodsFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Used bridge pattern for different kinds of phone with different countries for example we have fax phone,
        // Telephone and Mobile and ... and all of these may have different precodes or limitations
        // based on country. So instead of creating different classes like IranMobile or IranTelephone
        // or USAPhone or USAMobile we use bridge pattern and composition
        // Used Adapter pattern for add cost Euro per minute without changing main classes
        // Used Factory Pattern for getting methods
        // Used Repository for separating logic of CRUD methods from main class and abiding with single responsibility
        Scanner scanner = new Scanner(System.in);
        PhoneRepositoryMethodsFactory methodFactory = new PhoneRepositoryMethodsFactory(scanner);
        String methodName = "";


        System.out.println("Welcome to this tiny phone book :)");

        while (!methodName.equals("exit")) {
            System.out.print("Commands List:" +
                    "1- getPerson(GP), 2- getPhoneOwner(GPO), 3- saveNumber(SN) \n" +
                    "4- deletePerson(DP), 5- deletePhoneNumber(DPN)\n" +
                    "6- exit(for exiting the program)\n" +
                    "Please enter your command: \n");
            methodName = scanner.nextLine();
            methodFactory.getMethod(methodName);
        }
    }
}
