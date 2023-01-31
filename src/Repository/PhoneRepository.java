package src.Repository;

import src.Person;
import src.Phone;

import java.util.List;
import java.util.Map;

public interface PhoneRepository<T extends Phone> {

    List<T> getPersonPhones(String personPassportId);

    Person getPhoneOwner(String number);

    void save(String personPassportId, String number);

    void deletePerson(String personPassportId);

    void deletePhoneNumber(String number);


}
