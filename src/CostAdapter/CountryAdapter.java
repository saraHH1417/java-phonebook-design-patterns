package src.CostAdapter;

import src.bridge.Country;

public abstract class CountryAdapter extends Country implements AdapterService {

    @Override
    public float costPerMinute() {
        return costInEuroPerMinute();
    }
}
