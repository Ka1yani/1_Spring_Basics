package com.kalyani.springin5steps.springIn5Steps.cdi;

import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {
    @Inject
    SomeCDIDAO someCDIDAO;

    @Override
    public String toString() {
        return "SomeCDIBusiness{" +
                "someCDIDAO=" + someCDIDAO +
                '}';
    }

    public SomeCDIDAO getSomeCDIBusiness(){
        return someCDIDAO;
    }
    public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
        this.someCDIDAO = someCDIDAO;
    }
}
