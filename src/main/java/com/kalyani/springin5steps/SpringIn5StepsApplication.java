package com.kalyani.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		int result = binarySearch.binarySearch(new int[]{1,3,2,4,14,78,12},3);
		System.out.println(result);
	}

}
