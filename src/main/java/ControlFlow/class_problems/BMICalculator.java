package ControlFlow.class_problems;

import java.util.Scanner;

public class BMICalculator {

    public static String getBmiStatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] heights = new double[10];
        double[] weights = new double[10];

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter height of person " + (i + 1) + " in meters: ");
            heights[i] = sc.nextDouble();

            System.out.print("Enter weight of person " + (i + 1) + " in kg: ");
            weights[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.println("Person | Height | Weight | BMI | Status");

        for (int i = 0; i < 10; i++) {

            double bmi = weights[i] / (heights[i] * heights[i]);

            System.out.println(
                    (i + 1) + "      | " +
                            heights[i] + " | " +
                            weights[i] + " | " +
                            String.format("%.2f", bmi) + " | " +
                            getBmiStatus(bmi)
            );
        }
    }
}