package com.kalyani.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
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
