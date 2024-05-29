public class StandardDeviation implements StatisticalMeasure {
    private double[] data;

    public StandardDeviation(double[] data) {
        this.data = data;
    }

    @Override
    public double calculate() {
        return Math.sqrt(new Variance(data).calculate());
    }
}
