/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms.primality;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 *
 * @author nonfrt
 */
public class EratosthenesPrimality implements Primality{

    @Override
    public boolean isPrime(long x) {
        List<Long> primes = getPrimesBelow(x+1);
        return primes.contains(x);
    }

    @Override
    public List<Long> getPrimesBelow(long n) {
        List<Long> primes = new ArrayList<>();
        int earlyStop = (int) Math.sqrt(n);
        BitSet composites = new BitSet(earlyStop+1);
        int x = 2;
        do {
            primes.add((long)x);
            // Take the multiples out of the running
            int multiple = x;
            do {
                multiple += x;
                composites.set(multiple);
            } while(multiple < n);
            x += 1;
            x = composites.nextClearBit(x); // <-- Its prime!
        } while (x < earlyStop + 1);
        
        while (x < n + 1) {
            primes.add((long) x);
            x += 1;
            x = composites.nextClearBit(x);
        }
            
        return primes;
    }
    
}
