package com.kalyani.springin5steps.componentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
    @Autowired
    ComponentJDBCConnection jdbcConnection;

    public ComponentJDBCConnection getJdbcConnection(){
        return jdbcConnection;
    }
    public void setComponentJDBCConnection(ComponentJDBCConnection jdbcConnection){
        this.jdbcConnection =jdbcConnection;
    }
}
