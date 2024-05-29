import java.util.Arrays;

public class Median implements StatisticalMeasure {
    private double[] data;

    public Median(double[] data) {
        this.data = data;
    }

    @Override
    public double calculate() {
        Arrays.sort(data);
        int size = data.length;
        if (size % 2 == 0) {
            return (data[size / 2 - 1] + data[size / 2]) / 2.0;
        } else {
            return data[size / 2];
        }
    }
}
