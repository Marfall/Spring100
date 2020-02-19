package com.spring100.spring.aop.springaop.business;

import com.spring100.spring.aop.springaop.dao.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;

    public String calculateSomething() {

        //Business logic
       return dao1.retrieveSomething();
    }
}
