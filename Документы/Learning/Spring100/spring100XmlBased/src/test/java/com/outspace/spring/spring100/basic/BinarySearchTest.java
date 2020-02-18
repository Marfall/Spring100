package com.outspace.spring.spring100.basic;


import com.outspace.spring.spring100.Spring100BasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

// Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Spring100BasicApplication.class)
public class BinarySearchTest {


    // Get this bean from the context. When the context is loaded - the bean can be autowired
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public  void testBasicScenario() {

       int actualResult = binarySearch.binarySearch(new int[]{}, 5);
       assertEquals(3, actualResult);
        // call method on binarySearch
        // check if the value is correct
    }
}
