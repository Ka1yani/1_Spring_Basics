package com.kalyani.springin5steps.springIn5Steps.basic;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("quick_sort")
@Component
@Qualifier("Quick")
@Primary
public class QuickSortAlgorithm implements SortingAlgorithm {
@Override
    public int[] sort(int[] numbers){

        return numbers;
    }
}
