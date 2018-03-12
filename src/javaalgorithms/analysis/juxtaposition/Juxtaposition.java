/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.analysis.juxtaposition;

import java.util.Map;
import java.util.stream.Stream;
import javaalgorithms.analysis.timer.Timer;

/**
 *
 * @author nonfrt
 */
public abstract class Juxtaposition<T> {
    protected T[] items;
    protected Timer<T> timer;
    
    public Juxtaposition(Timer<T> timer, T... items) {
        this.items = items;
        this.timer = timer;
    }
    
    /**
     * 
     * @param iterations
     * @return Function Name -> Item.toString -> Average Time
     */
    public abstract Map<String,Map<String,Double>> timeIt(int iterations);
    
    public void timeItAndPrint(int iterations) {
        Map<String,Map<String,Double>> data = timeIt(iterations);
        for (String function : data.keySet()) {
            System.out.println("\n     "+function);
            System.out.println(pad("-",5+function.length()));
            data.get(function)
                    .entrySet().stream()
                    .sorted(Map.Entry.comparingByValue())
                    .forEachOrdered((entry) -> System.out.println( pad(entry.getKey(),10) + ": \t" + pad(entry.getValue()+"",10) ));
            
        }
    }
    
    private String pad(String string, int size) {
        return String.format("%1$" + size + "s", string);
    }
}
