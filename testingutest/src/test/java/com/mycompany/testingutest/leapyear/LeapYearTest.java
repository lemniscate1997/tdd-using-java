/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testingutest.leapyear;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rahul
 */
public class LeapYearTest {
    
    public LeapYearTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isLeapYear method, of class LeapYear.
     */
    @Test
    public void testIsLeapYear() {
        System.out.println("isLeapYear");
        int year = 2016;
        LeapYear instance = new LeapYear();
        String expResult = year + " is Leap Year.";
        String result = instance.isLeapYear(year);
        assertEquals(expResult, result);
    }
    
}
