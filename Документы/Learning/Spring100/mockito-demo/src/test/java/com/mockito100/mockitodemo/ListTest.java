package com.mockito100.mockitodemo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void testSize() {
            List listmock = mock(List.class);
            when(listmock.size()).thenReturn(10);
            assertEquals(10, listmock.size());
    }

    @Test
    public void testSize_multipleReturns() {
        List listmock = mock(List.class);
        when(listmock.size()).thenReturn(10).thenReturn(20);
        assertEquals(10, listmock.size());
        assertEquals(20, listmock.size());
        assertEquals(20, listmock.size());
    }

    @Test
    public void testGet_SpecifiParameter() {
        List listmock = mock(List.class);
        when(listmock.get(0)).thenReturn("SomeString");
        assertEquals("SomeString", listmock.get(0));
        assertEquals(null, listmock.get(1));
    }

    @Test
    public void testGet_GenericParameter() {
        List listmock = mock(List.class);
        when(listmock.get(Mockito.anyInt())).thenReturn("SomeString");
        assertEquals("SomeString", listmock.get(0));
        assertEquals("SomeString", listmock.get(1));
    }
}
