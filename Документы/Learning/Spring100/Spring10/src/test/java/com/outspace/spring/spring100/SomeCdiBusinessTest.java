package com.outspace.spring.spring100;


import com.outspace.spring.spring100.cdi.SomeCDIBusiness;
import com.outspace.spring.spring100.cdi.SomeCDIDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

// Load the context
@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

    //Inject the Mock
    @InjectMocks
    SomeCDIBusiness business;

    // Create Mock
    @Mock
    SomeCDIDAO daoMock;

    @Test
    public  void testBasicScenario() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] {2 , 4});
        //when daoMock.getData() is called, return int[]{2, 4}

       int actualResult = business.findGreates();
       assertEquals(4, actualResult);
    }
    @Test
    public  void testBasicScenario2() {

        Mockito.when(daoMock.getData()).thenReturn(new int[] {2, 3});

        int actualResult = business.findGreates();
        assertEquals(3, actualResult);
    }

    @Test
    public  void testBasicScenario_NoElements() {

        Mockito.when(daoMock.getData()).thenReturn(new int[] {});

        int actualResult = business.findGreates();
        assertEquals(Integer.MIN_VALUE, actualResult);
    }
}
