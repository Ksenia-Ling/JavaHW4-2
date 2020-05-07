public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(69, 1.64);
        System.out.printf("Ваш индекс массы тела - %.1f",bmi);
    }
}