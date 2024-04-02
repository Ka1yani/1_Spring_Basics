package com.kalyani.springin5steps;
public class BinarySearchImpl {
    public int binarySearch(int[] numbers, int numbersToSearchFor){
        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        System.out.println(bubbleSortAlgorithm);
        return 3;
    }
}
