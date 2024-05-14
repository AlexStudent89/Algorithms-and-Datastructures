//Compute Average Temperature Project:
 //Calculate the avarage temperature, and give how many days are above the average temperature

 //1. take an input from the user (eg 8)
 //2. prompt the user to enter all the 8 numbers
 //3. calculate the average temperature
 //4. Given the avarage temperature, how many of the numbers in line 2 are above the average temperature

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Take input from the user
        System.out.print("Enter the number of temperatures: ");
        int numberOfTemperatures = scanner.nextInt();

        // 2. Prompt the user to enter all the temperatures
        int[] temperatures = new int[numberOfTemperatures];
        System.out.println("Enter the temperatures:");
        for (int i = 0; i < numberOfTemperatures; i++) {
            temperatures[i] = scanner.nextInt();
        }

        // 3. Calculate the average temperature
        double sum = 0;
        for (int temp : temperatures) {
            sum += temp;
        }
        double averageTemperature = sum / numberOfTemperatures;
        System.out.println("Average temperature: " + averageTemperature);

        // 4. Count temperatures above the average
        int countAboveAverage = 0;
        for (int temp : temperatures) {
            if (temp > averageTemperature) {
                countAboveAverage++;
            }
        }
        System.out.println("Number of temperatures above the average: " + countAboveAverage);

        scanner.close();
    }
}
