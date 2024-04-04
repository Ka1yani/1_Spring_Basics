package com.kalyani.springin5steps.springIn5Steps.basic;

import com.kalyani.springin5steps.springIn5Steps.basic.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {
    private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
    public static void main(String[] args) {
        //BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
        ApplicationContext applicationContext  = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
        LOGGER.info("{}" + personDAO);
        LOGGER.info("{}" + personDAO.getJdbcConnection());
        LOGGER.info("{}" + personDAO2);
        LOGGER.info("{}" + personDAO2.getJdbcConnection());
    }

}