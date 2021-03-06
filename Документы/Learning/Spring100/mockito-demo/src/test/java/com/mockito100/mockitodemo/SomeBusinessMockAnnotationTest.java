package com.mockito100.mockitodemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(SpringExtension.class)
public class SomeBusinessMockAnnotationTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl businessImpl;


    @Test
    public void testFindTheGreatestFromAllData() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 15, 3});
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(24, result);
    }

    @Test
    public void testFindTheGreatestFromAllData_ForOneValue() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(15, result);
    }
}
