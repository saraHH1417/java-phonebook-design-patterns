package src;

import src.bridge.Country;

public abstract class Phone {
    protected Country country;
    protected String number;

    public Phone(Country country, String number) {
        this.country = country;
        this.number = number;
    }
    public abstract String getNumber();

    public abstract String getPreCode();
    public abstract float getCostPerMinute();

}
