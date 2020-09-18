public class BmiService {
    public float calculate(float weightKg, float heightM) {

        float growthSquared = heightM * heightM;
        float bmi = weightKg / growthSquared;

        return bmi;
    }
}
