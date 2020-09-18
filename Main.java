public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weightKg;
        float heightM;

        float bmi = service.calculate(weightKg = 60, heightM = 1_6);
        System.out.println(bmi);
    }
}
