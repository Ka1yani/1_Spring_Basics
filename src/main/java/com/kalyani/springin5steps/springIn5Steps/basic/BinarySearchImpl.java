package com.kalyani.springin5steps.springIn5Steps.basic;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("Quick")
    private SortingAlgorithm sortingAlgorithm;

    //Comment out @Autowired while using @Qualifier
    /*public BinarySearchImpl( @Qualifier("bubble_sort") SortingAlgorithm sortingAlgorithm){
        this.sortingAlgorithm = sortingAlgorithm;
    }*/
    /*public BinarySearchImpl(SortingAlgorithm sortingAlgorithm){
        this.sortingAlgorithm = sortingAlgorithm;
    }*/
    /*public void setBubbleSortAlgorithm(SortingAlgorithm sortingAlgorithm){
        this.sortingAlgorithm = sortingAlgorithm;
    }*/
    public int binarySearch(int[] numbers, int numbersToSearchFor){
        //BinarySearchImpl bubbleSortAlgorithm = new BubbleSortAlgorithm();
        //int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        int[] sortedNumbers = sortingAlgorithm.sort(numbers);
        //System.out.println(bubbleSortAlgorithm);
        System.out.println(sortingAlgorithm);
        return 3;
    }
    @PostConstruct
    public void postConstruct() {
        logger.info("PostConstruct");
    }
    @PreDestroy
    public void preDestroy() {
        logger.info("PreDestroy");
    }
}
