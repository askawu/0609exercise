package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
    public double calculateAverage(double[] array)
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
        double average1;
        double average2;
        average1 = calculateAverage(array1);
        average2 = calculateAverage(array2);

        return Math.abs(average1 - average2);
    }

    public double calculateSampleVariance(double[] elements)
    {
        double average1;
        average1 = calculateAverage(elements);
        
        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - average1, 2);
        }
        
        return temp / (elements.length - 1);
    }
}
