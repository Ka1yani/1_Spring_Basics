package com.kalyani.springin5steps;
import org.springframework.stereotype.Component;

@Component

public interface SortingAlgorithm {
    int[] sort(int[] inputArray);
}
