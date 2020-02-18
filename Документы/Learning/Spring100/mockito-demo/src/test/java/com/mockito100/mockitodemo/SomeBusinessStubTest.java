package com.mockito100.mockitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessStubTest {

    @Test
    public void testFindTheGreatestFromAllData() {

        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(15, result);
    }
}

class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] {4, 6, 15};
    }
}