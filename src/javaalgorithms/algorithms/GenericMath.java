/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms;

/**
 *
 * @author nonfrt
 */
public class GenericMath {
    
    private static final double LOG2 = Math.log(2.0);
    
    /**
     * Log base 2 of x. Returns the power needed to raise 2 to
     * the value of x.
     * @param x
     * @return 
     */
    public static double log2(double x) {
        return Math.log(x)/LOG2;
    }
    
    /**
     * Returns true if there exists a and b such that n = a^b
     * https://cstheory.stackexchange.com/a/2079
     * @param n
     * @return 
     */
    public static boolean isPerfectPower(long n) {
        long maxB = (long)Math.floor(log2(n))+1; // 2 is the smallest possible a so this is the largest possible b
        long sqrtN = (long)Math.sqrt(n)+1;
        for (long b = 2; b < maxB; b++) { // potential b
            // Binary search for a
            long low = 2;
            long high = n;
            while (low<high-1) {
                long a = (low + high)/2; // potential a
                long ab = (long)Math.pow(a, b); // a^b
                if (ab == n)
                    return true;
                if (ab > n)
                    high = a;
                else
                    low = a;
            }
        }
        return false;
    }
    
    /**
     * Finds the greatest common divisor of a and b
     * https://stackoverflow.com/a/4009247/4769802
     * @param a
     * @param b
     * @return 
     */
    public static long gcd(long a, long b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
    
    /**
     * Returns x such that a^x = 1 mod n 
     * https://stackoverflow.com/a/642533/4769802
     * @param a
     * @param n
     * @return 
     */
    public static long multiplicativeOrder(long a, long n) {
        if (gcd(a,n) > 1) // coprime?
            return 0;
        else {
            long order = 1;
            long result = a;
            while (result != 1) { // brute force
                order += 1;
                result = (result*a) % n;
            }
            return order;
        }
    }
    
    /**
     * Returns base^exponent % modulus
     * @param base
     * @param exponent
     * @param modulus
     * @return 
     */
    public static long modPower(long base, long exponent, long modulus) {
        while(exponent > 0) {
            base = base*base % modulus;
            exponent--;
        }
        return base;
    }
    
    /**
     * The count of the coprimes of x that are less than x
     * https://www.geeksforgeeks.org/eulers-totient-function/
     * @param x
     * @return 
     */
    public static long totient(long x) {
        long result = x;
        
        for (long p = 2; p*p <= x; p++) {
            if (x%p == 0) {
                while (x%p == 0)
                    x = x/p;
                result -= result / p;
            }
        }
        
        if (x > 1)
            result -= result / x;
        
        return result;
    }
}
