package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
        double sum1 = 0;
        double average1;

        for (double element : array1) {
            sum1 += element;
        }
        average1 = sum1 / array1.length;

        double sum2 = 0;
        double average2;

        for (double element : array2) {
            sum2 += element;
        }
        average2 = sum2 / array2.length;

        double average1 = getAverage(array1);
        double average2 = getAverage(array2);
        return Math.abs(average1 - average2);
    }

    public double calculateSampleVariance(double[] elements)
    private double getAverage(double[] array)
    {
        double sum1 = 0;
        double average1;
        for (double element : elements) {
        for (double element : array)
            sum1 += element;
        }
        average1 = sum1 / elements.length;
        average1 = sum1 / array.length;
        return average1;


        }
        public double calculateSampleVariance(double[] elements)
        {

        double average1 = getAverage(elements);
        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - average1, 2);
        }
        return temp / (elements.length - 1);

    }
}
