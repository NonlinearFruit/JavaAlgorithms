/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.analysis.juxtaposition;

import java.util.HashMap;
import java.util.Map;
import javaalgorithms.algorithms.primality.Primality;
import javaalgorithms.analysis.timer.Timer;

/**
 *
 * @author nonfrt
 */
public class PrimalityJuxtaposition extends Juxtaposition<Primality> {

    public PrimalityJuxtaposition(Timer<Primality> timer, Primality... items) {
        super(timer, items);
    }
    
    @Override
    public Map<String,Map<String,Double>> timeIt(int iterations) {
        Map<String,Map<String,Double>> data = new HashMap<>();
        
        // Test isPrime
        data.put("isPrime", new HashMap<>());
        for (Primality primeTest : items) {
            long totalTime = 0;
            for (int i = 0; i < iterations; i++) {
                long start = System.nanoTime();
                timer.timeIt(primeTest);
                totalTime += System.nanoTime() - start;
            }
            String testName = primeTest.toString();
            double aveTime = totalTime/iterations;
            data.get("isPrime").put(testName,aveTime);
        }
        
        // Test primesBelow
        data.put("primesBelow", new HashMap<>());
        for (Primality primeTest : items) {
            long totalTime = 0;
            for (int i = 0; i < iterations; i++) {
                long start = System.nanoTime();
                timer.timeIt(primeTest);
                totalTime += System.nanoTime() - start;
            }
            String testName = primeTest.toString();
            double aveTime = totalTime/iterations;
            data.get("primesBelow").put(testName,aveTime);
        }
        
        return data;
    }
    
}
