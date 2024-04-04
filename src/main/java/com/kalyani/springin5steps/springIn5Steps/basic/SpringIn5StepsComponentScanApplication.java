package com.kalyani.springin5steps.springIn5Steps.basic;

import com.kalyani.springin5steps.componentScan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.kalyani.springin5steps.componentScan")
public class SpringIn5StepsComponentScanApplication {
    private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
    public static void main(String[] args) {
        //BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
        ApplicationContext applicationContext  = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
        LOGGER.info("{}" + componentDAO);
    }

}



























































