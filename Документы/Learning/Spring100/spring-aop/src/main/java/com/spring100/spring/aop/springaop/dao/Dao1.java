package com.spring100.spring.aop.springaop.dao;

import com.spring100.spring.aop.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    public String retrieveSomething() {
        return "Dao1";
    }
}
