public class Mode implements StatisticalMeasure {
    private double[] data;

    public Mode(double[] data) {
        this.data = data;
    }

    @Override
    public double calculate() {
        double mode = data[0];
        int maxCount = 0;
        for (int i = 0; i < data.length; i++) {
            double value = data[i];
            int count = 1;
            for (int j = 0; j < data.length; j++) {
                if (data[j] == value) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                mode = value;
            }
        }
        return mode;
    }
}
