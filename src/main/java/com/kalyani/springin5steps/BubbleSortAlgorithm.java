package com.kalyani.springin5steps;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("bubble_sort")
@Component
//@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortingAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}


