package com.init.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by CARLOS on 27/11/2016.
 */
public class PersonDAOTest {
    PersonDAO testInstance = new PersonDAO ();

    @Test
    public void testAdd ()
    {
        assertEquals(3, testInstance.add(1, 2));
    }
}
