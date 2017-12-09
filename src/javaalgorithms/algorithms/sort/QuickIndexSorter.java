/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms.sort;

import java.util.List;
import javaalgorithms.generators.ListGenerator;

/**
 *
 * @author nonfrt
 */
public class QuickIndexSorter<T> extends Sorter<T>{
    
    public QuickIndexSorter(ListGenerator<T> listgen) {
        super(listgen);
    }
    
    @Override
    public List<T> sort() {
        sort(0,getList().size());
        return getList();
    }
    
    /**
     * Starting at the 'start' index, split highs and lows and recurse
     * @param start inclusive
     * @param stop exclusive
     * @return 
     */
    private void sort(Integer start, Integer stop) {
        if (start + 1 >= stop)
            return;
        
        Integer index = start;
        T pivot = getList().get(index);
        for (int i = start+1; i < stop; i++) {
            T element = getList().get(i);
            if (getComparator().compare(element, pivot) < 0) {
                getList().remove(i);
                getList().add(index, element);
                index += 1;
            }
        }
        sort(start,index);
        sort(index+1,stop);
    }
}
