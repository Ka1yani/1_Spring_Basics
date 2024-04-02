package com.kalyani.springin5steps;
public class BinarySearchImpl {
    private SortingAlgorithm sortingAlgorithm;

    public BinarySearchImpl(SortingAlgorithm sortingAlgorithm){
        this.sortingAlgorithm = sortingAlgorithm;
    }
    public int binarySearch(int[] numbers, int numbersToSearchFor){
        //BinarySearchImpl bubbleSortAlgorithm = new BubbleSortAlgorithm();
        //int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        int[] sortedNumbers = sortingAlgorithm.sort(numbers);
        //System.out.println(bubbleSortAlgorithm);
        System.out.println(sortingAlgorithm);
        return 3;
    }
}
