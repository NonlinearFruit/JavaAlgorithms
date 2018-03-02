/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms.primality;

import java.util.List;

/**
 *
 * @author nonfrt
 */
public interface Primality {
    public boolean isPrime(long x);
    public List<Long> getPrimesBelow(long n);
}
