/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms;

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
public class GenericMathTest {
    
    public GenericMathTest() {
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
     * Test of isPerfectPower method, of class GenericMath.
     */
    @Test
    public void testIsPerfectPower() {
        System.out.println("isPerfectPower");
        long n = 0L;
        boolean expResult = false;
        boolean result = GenericMath.isPerfectPower(n);
        assertEquals(expResult, result);
        
        n = 1024;
        expResult = true;
        result = GenericMath.isPerfectPower(n);
        assertEquals(expResult,result);
        
        n = 1025;
        expResult = false;
        result = GenericMath.isPerfectPower(n);
        assertEquals(expResult,result);
        
        n = 81;
        expResult = true;
        result = GenericMath.isPerfectPower(n);
        assertEquals(expResult,result);
    }

    /**
     * Test of log2 method, of class GenericMath.
     */
    @Test
    public void testLog2() {
        System.out.println("log2");
        double x = 16.0;
        double expResult = 4.0;
        double result = GenericMath.log2(x);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of gcd method, of class GenericMath.
     */
    @Test
    public void testGcd() {
        System.out.println("gcd");
        long a = 1L;
        long b = 1L;
        long expResult = 1L;
        long result = GenericMath.gcd(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplicativeOrder method, of class GenericMath.
     */
    @Test
    public void testMultiplicativeOrder() {
        System.out.println("multiplicativeOrder");
        long a = 2L;
        long n = 5L;
        long expResult = 4L;
        long result = GenericMath.multiplicativeOrder(a, n);
        assertEquals(expResult, result);
    }

    /**
     * Test of modPower method, of class GenericMath.
     */
    @Test
    public void testModPower() {
        System.out.println("modPower");
        long base = 6L;
        long exponent = 2L;
        long modulus = 5L;
        long expResult = 1L;
        long result = GenericMath.modPower(base, exponent, modulus);
        assertEquals(expResult, result);
        
        base = 2L;
        exponent = 3L;
        modulus = 7L;
        expResult = 1L;
        result = GenericMath.modPower(base, exponent, modulus);
        assertEquals(expResult, result);
        
        base = 2L;
        exponent = 5L;
        modulus = 13L;
        expResult = 6L;
        result = GenericMath.modPower(base, exponent, modulus);
        assertEquals(expResult, result);
        
        base = 34L;
        exponent = 54L;
        modulus = 21L;
        expResult = 1L;
        result = GenericMath.modPower(base, exponent, modulus);
        assertEquals(expResult, result);
    }

    /**
     * Test of totient method, of class GenericMath.
     */
    @Test
    public void testTotient() {
        System.out.println("totient");
        long x = 5L;
        long expResult = 4L;
        long result = GenericMath.totient(x);
        assertEquals(expResult, result);
    }
    
}
