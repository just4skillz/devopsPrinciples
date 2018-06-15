package com.dissertation.devops;

import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void initialTest() {
        System.out.println("Printing a message from initial test...");
        assertTrue(true);
    }
}
