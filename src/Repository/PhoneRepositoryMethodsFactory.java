package src.Repository;

import src.Person;
import src.Phone;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PhoneRepositoryMethodsFactory {
    private PhoneRepositoryImpl phoneRepository;
    private Scanner scanner;

    public PhoneRepositoryMethodsFactory(Scanner scanner) {
        phoneRepository = new PhoneRepositoryImpl();
        this.scanner = scanner;
    };

    public void getMethod(String methodName) {
        if (methodName.equals("GP")) {
            System.out.println("Please enter Person Passport ID:");
            String passportId = scanner.nextLine();
            var phones = phoneRepository.getPersonPhones(passportId);
            int count = 1;
            if (phones.size() == 0) {
                System.out.println("There is no phone registered for this person");
            }

            for (Object phone : phones) {
                Phone phonee = (Phone) phone;
                System.out.println("Phone" + count + "; Precode: " + phonee.getPreCode() + "; Cost: " + phonee.getCostPerMinute());
                count++;
            }
            count = 1;

        } else if (methodName.equals("GPO")) {
            System.out.println("Please enter phone number with precode: ");
            String phoneNumber = scanner.nextLine();
            phoneRepository.getPhoneOwner(phoneNumber);


        } else if (methodName.equals("SN")) {
            System.out.println("Please enter Person Passport ID:");
            String savePersonPassportId = scanner.nextLine();
            System.out.println("Please enter Phone number you want to save:");
            String savePhoneNumber = scanner.nextLine();
            phoneRepository.save(savePersonPassportId, savePhoneNumber);


        } else if (methodName.equals("DP")) {
            System.out.println("Please enter the person passport id you want to delete");
            String deletePersonPassportId = scanner.nextLine();
            phoneRepository.deletePerson(deletePersonPassportId);


        } else if (methodName.equals("DPN")) {
            System.out.println("Please enter phone number you want to delete");
            String phoneNumber = scanner.nextLine();
            phoneRepository.deletePhoneNumber(phoneNumber);


        } else if (methodName.equals("exit")) {
            System.out.println("You are exiting the program. Good luck :)");
        }
        else {
            System.out.println("Invalid Command");
        }
    }
}
