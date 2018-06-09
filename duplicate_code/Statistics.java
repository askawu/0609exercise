package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
    public double calculateAverage(double[] array)
    {
        double sum = 0;

        for (double element : array) {
            sum += element;
        }
        return sum1 / array1.length;
    }

    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
        return Math.abs(calculateAverage(array1) - calculateAverage(array2));
    }

    public double calculateSampleVariance(double[] elements)
    {
        double average1 = calculateAverage(elements);
        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - average1, 2);
        }
        return temp / (elements.length - 1);
    }
}
