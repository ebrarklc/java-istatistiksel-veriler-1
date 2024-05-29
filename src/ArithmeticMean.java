public class ArithmeticMean implements StatisticalMeasure {
    private double[] data;

    public ArithmeticMean(double[] data) {
        this.data = data;
    }

    @Override
    public double calculate() {
        double sum = 0.0;
        for (double num : data) {
            sum += num;
        }
        return sum / data.length;
    }
}
