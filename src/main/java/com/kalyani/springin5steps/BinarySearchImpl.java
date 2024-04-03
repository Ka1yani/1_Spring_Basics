package com.kalyani.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortingAlgorithm bubbleSortAlgorithm;

    //Comment out @Autowired while using @Qualifier
    /*public BinarySearchImpl( @Qualifier("bubble_sort") SortingAlgorithm sortingAlgorithm){
        this.sortingAlgorithm = sortingAlgorithm;
    }*/
    /*public BinarySearchImpl(SortingAlgorithm sortingAlgorithm){
        this.sortingAlgorithm = sortingAlgorithm;
    }*/
    public void setBubbleSortAlgorithm(SortingAlgorithm bubbleSortAlgorithm){
        this.bubbleSortAlgorithm = bubbleSortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numbersToSearchFor){
        //BinarySearchImpl bubbleSortAlgorithm = new BubbleSortAlgorithm();
        //int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        //System.out.println(bubbleSortAlgorithm);
        System.out.println(bubbleSortAlgorithm);
        return 3;
    }
}
