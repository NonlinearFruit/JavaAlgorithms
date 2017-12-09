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
public class InsertionSorter<T> extends Sorter<T>{

    public InsertionSorter(ListGenerator<T> listgen) {
        super(listgen);
    }
    
    public List<T> sort() {
        List<T> list = getList();
        for (int i = 0; i < list.size(); i++) {
            T element = list.remove(i);
            for (int j = 0; j < i+1; j++) {
                if (j == i || getComparator().compare(element, list.get(j)) < 0) {
                    list.add(j, element);
                    break;
                }
            }
        }
        return list;
    }
}
