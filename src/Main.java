import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen verileri giriniz (virgülle ayrılmış şekilde):");
        String input = scanner.nextLine();
        String[] inputData = input.split(",");
        double[] data = Arrays.stream(inputData).mapToDouble(Double::parseDouble).toArray();

        System.out.println("Hangi istatistiksel ölçümü yapmak istiyorsunuz? (arithmeticmean, median, mode, standarddeviation, variance):");

        String choice = scanner.nextLine().toLowerCase();

        StatisticalMeasure measure;

        switch (choice) {
            case "arithmeticmean":
                measure = new ArithmeticMean(data);
                System.out.println("Aritmetik Ortalama: " + measure.calculate());
                break;
            case "median":
                measure = new Median(data);
                System.out.println("Medyan: " + measure.calculate());
                break;
            case "mode":
                measure = new Mode(data);
                System.out.println("Mod: " + measure.calculate());
                break;
            case "standarddeviation":
                measure = new StandardDeviation(data);
                System.out.println("Standart Sapma: " + measure.calculate());
                break;
            case "variance":
                measure = new Variance(data);
                System.out.println("Varyans: " + measure.calculate());
                break;

            default:
                System.out.println("Geçersiz seçim.");
                break;
        }

        scanner.close();
    }
}