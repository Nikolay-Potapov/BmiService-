public class BmiService {

    public double calculate(double masa, double rost) {
        double index = masa / (rost * rost);
        return index;
    }
}
