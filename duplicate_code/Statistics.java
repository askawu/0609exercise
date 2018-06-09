package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
    public double averager(double[] array)
    {
        double sum = 0;
        double average;

        for (double element : array) {
            sum += element;
        }
        average = sum / array.length;

        return average;
    }

    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
        return Math.abs(averager(array1) - averager(array2));
    }

    public double calculateSampleVariance(double[] elements)
    {
        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - averager(elements), 2);
        }
        return temp / (elements.length - 1);

    }
}
