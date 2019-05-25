package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
        return (getAverage(array1)-getAverage(array2);
    }
    public double calculateSampleVariance(double[] elements)
    {
        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - getAverage(elements), 2);
        }
        return temp / (elements.length - 1);

    }

    public double getAverage (double[] array1)
    {
       double sum1 = 0;
       double average1;
       for (double element : array1){
	       sum1 + = element;
       }
       average1 = sum1 / array1.length;

       return average1;

    }
}
