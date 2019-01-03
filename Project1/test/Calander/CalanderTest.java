/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calander;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jordeguevara
 */
public class CalanderTest {
    
    public CalanderTest() {
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
     * Test of displayCalander method, of class Calander.
     */
    @Test
    public void testDisplayCalander() {
        System.out.println("displayCalander");
        int year = 0;
        Calander instance = null;
        instance.displayCalander(year);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfDaysinMonth method, of class Calander.
     */
    @Test
    public void testGetNumberOfDaysinMonth() {
        System.out.println("getNumberOfDaysinMonth");
        int month = 2;
        int year = 1998;
        Calander instance = null;
        int expResult = 28;
        int result = instance.getNumberOfDaysinMonth(month, year);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getFirstDayOfYear method, of class Calander.
     */
    @Test
    public void testGetFirstDayOfYear() {
        System.out.println("getFirstDayOfYear");
        int month = 0;
        int year = 0;
        Calander instance = null;
        int expResult = 0;
        int result = instance.getFirstDayOfYear(month, year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLeapYear method, of class Calander.
     */
    @Test
    public void testIsLeapYear() {
        System.out.println("isLeapYear");
        int year = 0;
        Calander instance = null;
        boolean expResult = false;
        boolean result = instance.isLeapYear(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMonthNammes method, of class Calander.
     */
    @Test
    public void testPrintMonthNammes() {
        System.out.println("printMonthNammes");
        int month = 0;
        Calander instance = null;
        instance.printMonthNammes(month);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printWeekTitles method, of class Calander.
     */
    @Test
    public void testPrintWeekTitles() {
        System.out.println("printWeekTitles");
        Calander instance = null;
        instance.printWeekTitles();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMonthBody method, of class Calander.
     */
    @Test
    public void testPrintMonthBody() {
        System.out.println("printMonthBody");
        int number_of_days = 0;
        int startdate = 0;
        Calander instance = null;
        instance.printMonthBody(number_of_days, startdate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paddingNeeded method, of class Calander.
     */
    @Test
    public void testPaddingNeeded() {
        System.out.println("paddingNeeded");
        int startdate = 0;
        Calander instance = null;
        int expResult = 0;
        int result = instance.paddingNeeded(startdate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
