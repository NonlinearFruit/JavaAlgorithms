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
public class BubbleSorter<T> extends Sorter<T>{
    
    public BubbleSorter( ListGenerator<T> listgen ) {
        super(listgen);
    }
    
    @Override
    public List sort() {
        List<T> list = getList();
        boolean hadSwap = true;
        while(hadSwap) {
            hadSwap = false;
            for (int i = 0; i < list.size() - 1; i++) {
                T first = list.get(i);
                T second = list.get(i+1);
                if (getComparator().compare(first, second) > 0) {
                    list.remove(i);
                    list.add(i+1, first);
                    hadSwap = true;
                }
            }
        }
        return list;
    }
    
}
