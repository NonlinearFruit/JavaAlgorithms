/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.analysis.timer;

/**
 * Times an algorithm of type T on a specific method
 * @author nonfrt
 */
public interface Timer<T> {
    
    /**
     * returns the number (or average number) of nanoseconds
     * the provided algorithm took to execute the method
     * @param item
     * @return 
     */
    public double timeIt(T algorithm);
}
