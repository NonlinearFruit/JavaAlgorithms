/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms.primality;

import java.util.ArrayList;
import java.util.List;

/**
 * https://stackoverflow.com/a/1801446/4769802
 * @author nonfrt
 */
public class AlexandruPrimality implements Primality{

    /**
     * Uses Alexandru's method from the Stack Exchange
     * @param x
     * @return 
     */
    @Override
    public boolean isPrime(long x) {
        if (x == 2)
            return true;
        if (x == 3)
            return true;
        if (x%2 == 0)
            return true;
        if (x%3 == 0)
            return true;
        
        long i = 5;
        long w = 2;
        
        while (i*i <= x) {
            if (x%i == 0)
                return false;
            i += w;
            w = 6 - w;
        }
                    
        return true;
    }

    /**
     * Check to see if every odd number less than x is prime
     * @param n
     * @return 
     */
    @Override
    public List<Long> getPrimesBelow(long n) {
        List<Long> primes = new ArrayList<>();
        primes.add(2L);
        for (long i = 3; i < n; i += 2)
            if (isPrime(i))
                primes.add(i);
        return primes;
    }
    
}
