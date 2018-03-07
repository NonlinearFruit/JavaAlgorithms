/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms.primality;

import java.util.ArrayList;
import java.util.List;
import javaalgorithms.algorithms.GenericMath;

/**
 *
 * @author nonfrt
 */
public class MillerRabinPrimality implements Primality {
    
    @Override
    public boolean isPrime(long n) {
        // n < 5 and evens
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
//        if (n % 2 == 0) {
//            return false;
//        }
        if (n == 3) {
            return true;
        }
        // Find s & d such that d*2^s == n-1
        long s = Long.numberOfTrailingZeros(n-1);
        long d = (n-1)>>s;

        // Test all possible composite witnesses (guarenteed for n<2^64)
        long[] numbers;
        if (n < 2047)
            numbers = new long[]{2};
        else if (n < 1373653)
            numbers = new long[]{2, 3};
        else if (n < 9080191)
            numbers = new long[]{31, 73};
        else if (n < 25326001)
            numbers = new long[]{2,3,5};
        else if (n < 3215031751L)
            numbers = new long[]{2,3,5,7};
        else if (n < 4759123141L)
            numbers = new long[]{2,7,63};
        else if (n < 1122004669633L)
            numbers = new long[]{2,13,23,1662803};
        else if (n < 2152302898747L)
            numbers = new long[]{2,3,5,7,11};
        else if (n < 3474749660383L)
            numbers = new long[]{2,3,5,7,11,13};
        else if (n < 341550071728321L)
            numbers = new long[]{2,3,5,7,11,13,17};
        else if (n < 3825123056546413051L)
            numbers = new long[]{2,3,5,7,11,13,17,19,23};
        else
            numbers = new long[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};
        
        for (long a : numbers) {
            if (a >= n)
                break;
            boolean pass = true;
            long aEXPd = GenericMath.modPower(a, d, n);
            if (aEXPd == 1)
                continue;
            for (long r = 0; r < s; r++) {
                long exp = (long) Math.pow(2, r)*d;
                if (GenericMath.modPower(a, exp, n) == n-1)
                    pass = false;
            }
            if (pass)
                return false;
        }
        return true;
    }
    
    @Override
    public List<Long> getPrimesBelow(long n) {
        List<Long> list = new ArrayList<>();
        list.add(2L);
        for (long i = 3; i < n; i+=2)
            if (isPrime(i))
                list.add(i);
        return list;
    }
    
}
