package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
	double average1 = computeAverage(array1);
	double average2 = computeAverage(array2);
        
        return Math.abs(average1 - average2);
    }

    public double calculateSampleVariance(double[] elements)
    {
        double average1 = computeAverage(elements);
        
        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - average1, 2);
        }
        return temp / (elements.length - 1);
    }

    public double computeAverage(double[] array){
        double sum = 0;
	for (double element : array){
	    sum += element;
	}
	return sum / array.length;
    }
}
