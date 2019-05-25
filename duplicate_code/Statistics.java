package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
        average1 = calculateAverage(array1);

        average2 = calculateAverage(array2);

        return Math.abs(average1 - average2);
    }

    public double calculateSampleVariance(double[] elements)
    {
        average1 = calculateAverage(elements);
        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - average1, 2);
        }
        return temp / (elements.length - 1);

    }
	
	public double calculateAverage(double[] average)
    {
        double sum1 = 0;
        double average1;

        for (double element : array1) {
            sum1 += element;
        }
        average1 = sum1 / array1.length;
    }
}