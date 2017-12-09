/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms.sort;

/**
 *
 * @author nonfrt
 */
public class SortTimer {
    
    private int iterations;
    
    public SortTimer(int iterations) {
        this.iterations = iterations;
    } 
    
    /**
     * Returns the average of performing the sort 'iterations' times
     * in nanoseconds
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
        return totalTime*1.0/iterations;
    }
}
