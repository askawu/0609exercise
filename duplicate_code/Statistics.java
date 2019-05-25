package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
    
	
	private double calculateAverage(double[] array)
    {
        double sum = 0.0;
        double average = 0.0;

        for (double element : array) {
             sum += element;
        }
    
	average = sum / array.length;

			 return average;
    }

        
 public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
        average1 = calculateAverage(array1);
        average2 = calculateAverage(array2);
        

        return Math.abs(average1 - average2);
    }

    public double calculateSampleVariance(double[] elements)
    {
        average =  calculateAverage(elements);
		
        
        double temp = 0.0;
        for (double element : elements) {
             temp += Math.pow(element - average, 2);
        }
        return temp / (elements.length - 1);

    }
}