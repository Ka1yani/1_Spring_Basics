package com.kalyani.springin5steps;

import com.kalyani.springin5steps.componentScan.ComponentDAO;
import com.kalyani.springin5steps.springIn5Steps.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringIn5StepsCDIApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCDIApplication.class);
    public static void main(String[] args) {
        //BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
        ApplicationContext applicationContext  = SpringApplication.run(SpringIn5StepsCDIApplication.class, args);
        SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);
        LOGGER.info("{}", someCDIBusiness);
    }

}