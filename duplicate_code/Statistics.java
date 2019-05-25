package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
        double average1 = CaculateAverage(array1);
        double average2 = CaculateAverage(array2);
        return Math.abs(average1 - average2);
    }

    public double calculateSampleVariance(double[] elements)
    {
        double average1 = CaculateAverage(elements);
        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - average1, 2);
        }
        return temp / (elements.length - 1);

    }
    private double CaculateAverage (double[] elements){
        double sum = 0.0;
        double average = 0.0;
        
        for (double element : elements) {
            sum += element;
        }
        average = sum / elements.length;
        return average;        
    }
}
