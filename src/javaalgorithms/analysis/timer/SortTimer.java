/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.analysis.timer;

import java.text.DecimalFormat;
import javaalgorithms.algorithms.sort.Sorter;
import javaalgorithms.analysis.timer.Timer;

/**
 * Time a sort algorithm to see how fast it is!
 * @author nonfrt
 */
public class SortTimer implements Timer<Sorter>{
    
    private DecimalFormat oneDigit = new DecimalFormat("#0.0");//format to 1 decimal place
    private int iterations;
    
    public SortTimer(int iterations) {
        this.iterations = iterations;
    } 
    
    /**
     * Returns the average of performing the sort 'iterations' times
     * in nanoseconds. It is rounded to 1 decimal place.
     * @return 
     */
    public double timeIt(Sorter sorter) {
        long totalTime = 0;
        for (int i = 0; i < iterations; i++) {
            sorter.reset(); // Make sure we don't time this
            long time = System.nanoTime();
            sorter.sort();
            totalTime += System.nanoTime() - time;
        }
        return Double.valueOf(oneDigit.format(totalTime*1.0/iterations));
    }
}
