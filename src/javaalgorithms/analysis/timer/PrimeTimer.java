/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.analysis.timer;

import java.text.DecimalFormat;
import java.util.Random;
import javaalgorithms.algorithms.primality.Primality;
import javaalgorithms.analysis.timer.Timer;

/**
 *
 * @author nonfrt
 */
public class PrimeTimer implements Timer<Primality>{
    
    private DecimalFormat oneDigit = new DecimalFormat("#0.0");//format to 1 decimal place
    private int iterations;
    private Random rnd;

    public PrimeTimer(int iterations) {
        this(iterations,3141592);
    }
    
    public PrimeTimer(int iterations, int seed) {
        this.iterations = iterations;
        this.rnd = new Random(seed);
    }

    /**
     * Returns the average of performing the sort 'iterations' times in
     * nanoseconds. It is rounded to 1 decimal place.
     *
     * @return
     */
    public double timeIt(Primality primer) {
        long totalTime = 0;
        for (int i = 0; i < iterations; i++) {
            long number = Math.abs(rnd.nextInt(1000000));
            long time = System.nanoTime();
            primer.isPrime(number);
            totalTime += System.nanoTime() - time;
        }
        return Double.valueOf(oneDigit.format(totalTime * 1.0 / iterations));
    }
}
