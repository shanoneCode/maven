package com.monapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAdditionner() {
        assertEquals(5, App.additionner(2, 3));
        assertEquals(0, App.additionner(0, 0));
        assertEquals(10, App.additionner(4, 6));
    }

    @Test
    public void testSaluer() {
        assertEquals("Bonjour Jean !", App.saluer("Jean"));
        assertEquals("Bonjour DevSecOps !", App.saluer("DevSecOps"));
    }

}