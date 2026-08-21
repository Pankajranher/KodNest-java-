import java.util.Scanner;

class SalesAnalyzer {
    double[] dailySales;

    SalesAnalyzer(double[] dailySales) {
        this.dailySales = dailySales;
    }

    double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < dailySales.length; i++) {
            total += dailySales[i];
        }

        return total;
    }

    double calculateAverage() {
        double total = calculateTotal();
        double average = calculateTotal() / dailySales.length;
        return average;

    }

    int findHighestSalesDay() {
        int HighestSalesDay = 0;

        for (int i = 1; i < dailySales.length; i++) {
            if (dailySales[i] > dailySales[HighestSalesDay]) {
                HighestSalesDay = i;
            }
        }

        return HighestSalesDay + 1;
    }

    int findLowestSalesDay() {

        int lowestSalesDay = 0;

        for (int i = 1; i < dailySales.length; i++) {
            if (dailySales[i] < dailySales[lowestSalesDay]) {
                lowestSalesDay = i;
            }
        }
        return lowestSalesDay + 1;
    }

    int countAboveAverageDays() {
        double average = calculateAverage();

        int aboveAverage = 0;

        for (int i = 0; i < dailySales.length; i++) {
            if (dailySales[i] > average) {
                aboveAverage++;
            }
        }

        return aboveAverage;
    }

    void displayReport() {
        System.out.println("Number of Days: " + dailySales.length);
        System.out.println("Total Sales: " + calculateTotal());
        System.out.println("Average Sales: " + calculateAverage());
        System.out.println("Highest Sales Day: " + findHighestSalesDay());
        System.out.println("Highest Sales: " + dailySales[findHighestSalesDay() - 1]);
        System.out.println("Lowest Sales Day: " + findLowestSalesDay());
        System.out.println("Lowest Sales: " + dailySales[findLowestSalesDay() - 1]);
        System.out.println("Days Above Average: " + countAboveAverageDays());
    }
}

public class Daily_sales_analyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDays = scanner.nextInt();

        double[] dailySales = new double[numberOfDays];

        for (int i = 0; i < dailySales.length; i++) {
            dailySales[i] = scanner.nextDouble();
        }

        SalesAnalyzer analyzer = new SalesAnalyzer(dailySales);
        analyzer.displayReport();

        scanner.close();
    }
}