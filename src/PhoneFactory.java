package src;

import src.bridge.Country;

public class PhoneFactory {

    public Phone getPhone(String phoneType, String number, Country country) {
        if (phoneType.equals("TEL")) {
            return new Telephone(country, number);
        } else if(phoneType.equals("MOB")) {
            return new Mobile(country, number);
        } else {
            return null;
        }
    }
}
