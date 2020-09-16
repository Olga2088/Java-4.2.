public class BmiService {
    public float calculate() {
        float weightKg = 60;
        float heightM = 1.6f;
        float growthSquared = heightM * heightM;
        return (float) (weightKg / growthSquared);
    }
}
