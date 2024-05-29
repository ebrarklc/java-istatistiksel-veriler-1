public class Variance implements StatisticalMeasure {
    private double[] data;

    public Variance(double[] data) {
        this.data = data;
    }

    @Override
    public double calculate() {
        double mean = new ArithmeticMean(data).calculate();
        double temp = 0;
        for (double num : data) {
            temp += (mean - num) * (mean - num);
        }
        return temp / data.length;
    }
}
