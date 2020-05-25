/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testingutest.dfs;

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
public class DepthFirstSearchTest {

    public DepthFirstSearchTest() {
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
     * Test of getDFSString method, of class DepthFirstSearch.
     */
    @Test
    public void testGetDFSString() {
        int[][] array = {
            {0, 1, 1, 0, 0},
            {1, 0, 0, 1, 1},
            {1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0},
            {0, 1, 0, 0, 0}
        };
        int size = 5;
        DepthFirstSearch instance = new DepthFirstSearch();
        String expResult = "[0, 1, 3, 4, 2]";
        String result = instance.getDFSString(array, size);
        assertEquals(expResult, result);
    }

}
