package src.bridge;

public class USA extends Country{
    @Override
    public String preCode() {
        return "001";
    }

    @Override
    public float costPerMinute() {
        return 3;
    }
}
