package com.kalyani.springin5steps;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("quick_sort")
@Component
//@Primary
public class QuickSortAlgorithm implements SortingAlgorithm{
@Override
    public int[] sort(int[] numbers){

        return numbers;
    }
}
