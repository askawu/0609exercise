package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {

        double average1 = through(double[] array1);
        double average2 = through(double[] array2);
        return Math.abs(average1 - average2);
    }
    public double through (double[] array)
    {
        sum=0;
        for (double element : array) {
            sum += element;
        }
        average=(sum / array.length)
        return  average
    }

    public double calculateSampleVariance(double[] elements)
    {
        double sum1 = 0;
        double average1;
        for (double element : elements) {
            sum1 += element;
        }
        average1 = sum1 / elements.length;
        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - average1, 2);
        }
        return temp / (elements.length - 1);

    }
}
