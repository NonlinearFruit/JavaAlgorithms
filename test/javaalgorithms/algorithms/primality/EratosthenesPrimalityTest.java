/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms.primality;

import java.util.Arrays;
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
public class EratosthenesPrimalityTest {
    
    public EratosthenesPrimalityTest() {
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
     * Test of isPrime method, of class EratosthenesPrimality.
     */
    @Test
    public void testIsPrime() {
        System.out.println("isPrime");
        long x = 0L;
        EratosthenesPrimality instance = new EratosthenesPrimality();
        boolean expResult = false;
        boolean result = instance.isPrime(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrimesBelow method, of class EratosthenesPrimality.
     */
    @Test
    public void testGetPrimesBelow() {
        System.out.println("getPrimesBelow");
        long n = 10L;
        EratosthenesPrimality instance = new EratosthenesPrimality();
        List<Long> expResult = Arrays.asList(2L,3L,5L,7L);
        List<Long> result = instance.getPrimesBelow(n);
        assertEquals(expResult, result);
        
        n = 20L;
        instance = new EratosthenesPrimality();
        expResult = Arrays.asList(2L,3L,5L,7L, 11L, 13L, 17L, 19L);
        result = instance.getPrimesBelow(n);
        assertEquals(expResult, result);
    }
    
}
