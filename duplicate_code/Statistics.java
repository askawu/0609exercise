package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
        double sum = 0;
        double average1;
        double average2;

        for (double element : array1) {
            sum += element;
        }
        average1 = sum / array1.length;
        for (double element : array2) {
            sum += element;
        }
        average2 = sum / array2.length;

        return Math.abs(average1 - average2);
    }

    public double calculateSampleVariance(double[] elements)
    {
        double sum = 0;
        double average;
        for (double element : elements) {
            sum += element;
        }
        average = sum / elements.length;
        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - average, 2);
        }
        return temp / (elements.length - 1);

    }
}