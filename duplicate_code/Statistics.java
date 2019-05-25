package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
        return Math.abs(calcul_average(array1) -calcul_average(array2) );
    }

    private double calcul_average(double[] array)
   {
       	 double sum = 0;
          	 for (double element : array) {
           	      sum += element;
       	 }
	return  sum / array.length;
     }

    public double calculateSampleVariance(double[] elements)
    {
        double average=calcul_average(elements);

        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - average, 2);
        }
        return temp / (elements.length - 1);
    }
}