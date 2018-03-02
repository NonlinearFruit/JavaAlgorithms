/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms.primality;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author nonfrt
 */
public class SquareRootPrimality implements Primality{

    /**
     * Check to see if any number less than or equal to the sqrt(x) divides x
     * @param x
     * @return 
     */
    @Override
    public boolean isPrime(long x) {
        for (long i = 2; i < x/i; i++)
            if (x%i == 0)
                return false;
        return true;
    }

    /**
     * Check to see if every number less than x is prime
     * @param n
     * @return 
     */
    @Override
    public List<Long> getPrimesBelow(long n) {
        List<Long> primes = new ArrayList<>();
        for (long i = 2; i < n; i++)
            if (isPrime(i))
                primes.add(i);
        return primes;
    }
    
}
