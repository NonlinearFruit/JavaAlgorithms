/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms.sort;

import java.util.Comparator;
import java.util.List;
import javaalgorithms.generators.ListGenerator;

/**
 *
 * @author nonfrt
 */
public abstract class Sorter<T> {
    
    private ListGenerator<T> listGenerator;
    private List<T> list;
    private Comparator<T> comparator;
    
    public Sorter(ListGenerator<T> listgen) {
        listGenerator = listgen;
        comparator = listGenerator.comparator();
    }
    
    public List<T> getList() {
        return list;
    }
    
    public Comparator<? super T> getComparator() {
        return comparator;
    }
    
    public void reset() {
        list = listGenerator.get();
    }
    
    /**
     * Only does the sorting! Should not reset anything so that the sort
     * algorithm can be accurately timed.
     * @return 
     */
    public abstract List<T> sort();
}
