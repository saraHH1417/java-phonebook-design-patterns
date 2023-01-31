package src.CostAdapter;

public class GermanyAdapter extends CountryAdapter{
    @Override
    public float costInEuroPerMinute() {
        return 2.5F;
    }

    @Override
    public String preCode() {
        return "0093";
    }
}
