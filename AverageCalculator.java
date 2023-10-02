import java.util.ArrayList;
import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a list of numbers separated by spaces:");
        String userInput = scanner.nextLine();

        AverageCalculator calculator = new AverageCalculator();
        double average = calculator.calculateAverage(userInput);

        System.out.println("The average of the inputted numbers is: " + average);
    }

    public double calculateAverage(String input) {
        String[] strArr = input.split(" ");
        ArrayList<Integer> numList = new ArrayList<>();

        for(String str : strArr) {
            try {
                numList.add(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                System.out.println(str + " is not a valid number");
                return 0;
            }
        }

        int total = 0;
        for(int num : numList) {
            total += num;
        }

        return numList.isEmpty() ? 0 : (double) total / numList.size();
    }
}
