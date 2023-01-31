package src.CostAdapter;

public class USAAdapter extends CountryAdapter{
    @Override
    public float costInEuroPerMinute() {
        return 3.5F;
    }

    @Override
    public String preCode() {
        return "001";
    }
}
