package com.directi.training.codesmells.duplicatecode;

public class Statistics {

    public double calculateAverage(double[] element) {
        double sum = 0;
        for (double value : element) {
            sum += value;
        }
        return sum / element.length;
    }

    public double calculateDifferenceOfAverage(double[] array1, double[] array2) {
        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);
        return Math.abs(average1 - average2);
    }

    public double calculateSampleVariance(double[] elements) {
        double average1 = calculateAverage(elements);

        double temp = 0;
        for (double element : elements) {
            temp += Math.pow(element - average1, 2);
        }
        return temp / (elements.length - 1);
    }
}
