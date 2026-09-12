package Arrays.class_problems;

import java.util.Scanner;

public class MaxProfit {

    public static int maxProfit(int[] prices) {

        int lowest = prices[0];
        int maximumProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < lowest) {
                lowest = prices[i];
            }

            int profit = prices[i] - lowest;

            if (profit > maximumProfit) {
                maximumProfit = profit;
            }
        }

        return maximumProfit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter prices:");

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.println("Maximum Profit: " + maxProfit(prices));
    }
}