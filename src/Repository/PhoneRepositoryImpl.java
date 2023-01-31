package src.Repository;

import src.Person;
import src.Phone;
import src.Telephone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneRepositoryImpl<T extends Phone> implements PhoneRepository {

    private Map<Person, List<T>> phoneBook = new HashMap<>();


    @Override
    public List<T> getPersonPhones(String personPassportId) {
        Person person = new Person(personPassportId);
        var personPhones = phoneBook.get(person);
        return personPhones;
    }

    @Override
    public Person getPhoneOwner(String number) {
        Person person = null;
        for (var entry: phoneBook.entrySet()) {
            for (Phone phone: entry.getValue()) {
                if ((phone.getNumber()).equals(number)) {
                   person = entry.getKey();
                   break;
                }
            }
        }
        return person;
    }

    @Override
    public void save(String personPassportId, String number) {
//        Phone phone = new Telephone();
//        Person person = new Person(personPassportId);
//        phoneBook.computeIfAbsent(person, k -> new ArrayList<>().add(phone););
//        if (phoneBook.containsKey(person)) {
//            phoneBook.get("")
//        }
    }

    @Override
    public void deletePerson(String personPassportId) {

    }

    @Override
    public void deletePhoneNumber(String number) {

    }
}
