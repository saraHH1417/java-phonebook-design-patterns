package src.CostAdapter;

public class IranAdapter extends CountryAdapter{
    @Override
    public float costInEuroPerMinute() {
        return 1.5F;
    }

    @Override
    public String preCode() {
        return "0098";
    }
}
