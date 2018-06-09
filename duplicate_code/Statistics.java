package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
	    return Math.abs(calAvg(array1) - calAvg(array2));
    }

    public double calAvg(double[] target){
    	double sum = 0;
	double average;
	for (double element : target){
		sum += element;
	}
	average = target / target.length;
	return average;
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
