public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weightKg = 60;
        float heightM;
        heightM = 1.6f;
        float bmi = service.calculate();
        System.out.println(bmi);
    }
}
