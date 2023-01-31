package src;

import src.bridge.Country;

public class Telephone extends Phone{
    public Telephone(Country country, String number) {
        super(country, number);
    }

    @Override
    public String getNumber() {
        return this.country.preCode() + this.number;
    }

    public String getPreCode() {
        return this.country.preCode();
    }

    @Override
    public float getCostPerMinute() {
        return this.country.costPerMinute();
    }
}
