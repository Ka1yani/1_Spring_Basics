package com.kalyani.springin5steps;
import org.springframework.stereotype.Component;

//@Component("bubble_sort")
@Component
public class BubbleSortAlgorithm implements SortingAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}


