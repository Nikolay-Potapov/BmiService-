public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double massa = 56;
        double rost = 1.68;
        double index = service.calculate(massa, rost);
        System.out.println("Body Mass Index = " + index);
    }
}