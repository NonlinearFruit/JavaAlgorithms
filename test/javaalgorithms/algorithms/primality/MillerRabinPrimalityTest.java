/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms.primality;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nonfrt
 */
public class MillerRabinPrimalityTest {
    
    public MillerRabinPrimalityTest() {
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
     * Test of isPrime method, of class MillerRabinPrimality.
     */
    @Test
    public void testIsPrime() {
        System.out.println("isPrime");
        long n = 0L;
        Primality instance = new MillerRabinPrimality();
        boolean expResult = false;
        boolean result = instance.isPrime(n);
        assertEquals(expResult, result);
        
        n = 740079L;
        expResult = false;
        result = instance.isPrime(n);
        assertEquals(expResult, result);
        
        n = 232779L;
        expResult = false;
        result = instance.isPrime(n);
        assertEquals(expResult, result);
        
        n = 6203L;
        expResult = true;
        result = instance.isPrime(n);
        assertEquals(expResult, result);
        
        n = 10301L;
        expResult = true;
        result = instance.isPrime(n);
        assertEquals(expResult, result);
        
        n = 782009L;
        expResult = true;
        result = instance.isPrime(n);
        assertEquals(expResult, result);
        
        n = 1299709L;
        expResult = true;
        result = instance.isPrime(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrimesBelow method, of class MillerRabinPrimality.
     */
    @Test
    public void testGetPrimesBelow() {
        // TODO
//        System.out.println("getPrimesBelow");
//        long n = 0L;
//        MillerRabinPrimality instance = new MillerRabinPrimality();
//        List<Long> expResult = null;
//        List<Long> result = instance.getPrimesBelow(n);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
