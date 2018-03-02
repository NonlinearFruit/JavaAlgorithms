/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms.primality;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javaalgorithms.algorithms.GenericMath;

/**
 *
 * @author nonfrt
 */
public class MillerRabinPrimality implements Primality {
    
    @Override
    public boolean isPrime(long n) {
        System.out.println("\n---Start---");
        // n < 5 and evens
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        if (n == 3) {
            return true;
        }

        // Find r & d such that d*2^r == n-1
        long s = 0;
        long d = n - 1;
        while (d % 2 == 0) {
            d /= 2;
            s++;
        }
        
        // Test all possible composite witnesses
        long min = (long) Math.min(n-1, Math.pow(Math.log(n),2)*2);
        System.out.println("min "+min);
        for (long a = 2; a <= min; a++) {
//            System.out.println(a+"a");
            boolean pass = true;
            long aEXPd = GenericMath.modPower(a, d, n);
//            System.out.println(aEXPd+"aEXPd");
            if (aEXPd == 1)
                continue;
            for (long r = 0; r < s; r++) {
//                System.out.println(r+"r");
                long exp = (long) Math.pow(2, r)*d;
//                System.out.println(exp+"exp");
                if (GenericMath.modPower(a, exp, n) == n-1)
                    pass = false;
            }
            if (!pass)
                return false;
        }
        return true;
    }
    
    // Incomplete Probable Prime
    public boolean isPrime(long n, long k) {
        System.out.println("\n---Start---");
        // n < 5 and evens
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        if (n == 3)
            return true;
        
        // Find r & d such that d*2^r == n-1
        long r = 0;
        long d = n-1;
        while (d%2 == 0) {
            d /= 2;
            r++;
        }
        
        System.out.println(r+"r "+d+"d");
        
        // Witness Loop
        for (int i = 0; i < k; i++) { // repeat k times
            long a = ThreadLocalRandom.current().nextLong(2, n-1);
            System.out.println(a+"a");
            long x = (long) Math.pow(a, d) % n;
            if (x == 1 || x == n-1)
                continue;
            long j = 0;
            for (; j < r-1; j++) { // repeat r-1 times
                x = (x*x) % n;
                System.out.println(x+"x");
                if (x == 1)
                    return false;
                if (x == n-1)
                    break;
            }
            System.out.println(j+"j "+r+"r");
            if (j == r-1)
                return false;
        }
        return true;
    }
    
    @Override
    public List<Long> getPrimesBelow(long n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
