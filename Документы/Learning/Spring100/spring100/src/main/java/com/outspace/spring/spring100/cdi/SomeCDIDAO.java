package com.outspace.spring.spring100.cdi;

import javax.inject.Named;

@Named
public class SomeCDIDAO {

    public int[] getData() {

        return new int[] {5, 89, 100};
    }
}
