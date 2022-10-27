import java.util.Scanner;
import java.util.Random;

import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        int ARRAY_SIZE = 100;
        int[] dataPoints = new int[ARRAY_SIZE];
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int[] values = new int[100];

        int[] scores = new int[100];

        for(int i=0; i< values.length; i++)
        {
            values[i] = gen.nextInt(100) + 1;  // set all to 1 to 100 instead of 0 to 99
        }

        for(int i=0; i< values.length; i++)
            System.out.printf("%4d |",values[i]);

        int sum = 0;
        double ave = 0;
        for(int i=0; i< values.length; i++)
            sum += values[i];

        System.out.println("\nThe sum of values is " + sum);
        ave =(double) sum / values.length;
        System.out.printf("Ave is %5.2f ", ave);
        System.out.println("The average is " +sum / values.length); // displays as an int Truncated

        int searchTarget = 0;
        boolean foundTarget = false;

        searchTarget = SafeInput.getRangedInt(in, "Enter an int value ", 1, 100);


        for (int e = 0; e < dataPoints.length; e++) {
            if (dataPoints[e] == searchTarget) {
                foundTarget = true;
                System.out.println("Found " + searchTarget + " at index " + e);
            }
        }
        if (!foundTarget) {
            System.out.println("Target " + searchTarget + " not found!");
        }
        foundTarget = false;

        int count = 0;
        for (int e : dataPoints) {
            if (e == searchTarget) count++;
        }
        System.out.println("The value " + searchTarget + " is found " + count + " time(s) " + "within the array.");

        //
        searchTarget = SafeInput.getRangedInt(in, "Enter another int value ", 1, 100);
        for (int e = 0; e < dataPoints.length; e++) {
            if (dataPoints[e] == searchTarget) {
                foundTarget = true;
                System.out.println("Breaking! Found " + searchTarget + " at index " + e);
                break;
            }
        }
        if (!foundTarget) {
            System.out.println("Target " + searchTarget + " not found!");
        }

        int firstIndex = 0;
        for (int e = 0; e < dataPoints.length; e++) {
            if (dataPoints[e] == searchTarget) {
                firstIndex = e;
                System.out.println("Breaking! Found " + searchTarget + " at index " + e);
                break;
            }
        }
        if (!foundTarget) {
            System.out.println("Target " + searchTarget + " not found!");
        }
        System.out.println("The value of " + searchTarget + " was found at array index " + firstIndex);

        //Min and Max
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int e = 0; e < dataPoints.length; e++) {
            if (min > dataPoints[e]) {
                min = dataPoints[e];
            }
            if (max < dataPoints[e]) {
                max = dataPoints[e];
            }
        }
        System.out.println("The min is " + min);
        System.out.println("The max is " + max);

        double[] dataPointsDouble = {5.5, 7.5, 3.5, 3.5};
        System.out.println("Average of dataPoints is: " + getAverage(dataPointsDouble));
    }

    public static double getAverage(double values[]) {
        double sum = 0;
        double average = 0;


        if (values != null && values.length != 0) {
            for (double d : values) {
                sum = sum + d; // sum +=e
            }
        }
        average = sum / values.length;
        return average;
    }
}
