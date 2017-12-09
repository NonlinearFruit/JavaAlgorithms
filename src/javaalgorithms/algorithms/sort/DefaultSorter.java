/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms.sort;

import java.util.Collections;
import java.util.List;
import javaalgorithms.generators.ListGenerator;

/**
 *
 * @author nonfrt
 */
public class DefaultSorter<T> extends Sorter<T> {

    public DefaultSorter( ListGenerator<T> generator) {
        super(generator);
    }
    
    @Override
    public List<T> sort() {
        Collections.sort(getList(),getComparator());
        return getList();
    }
    
}
