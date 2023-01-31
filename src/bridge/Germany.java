package src.bridge;

public class Germany extends Country {
    @Override
    public String preCode() {
        return "0093";
    }

    @Override
    public float costPerMinute() {
        return 2;
    }
}
