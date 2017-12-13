/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms.sort;

import java.util.ArrayList;
import java.util.List;
import javaalgorithms.generators.ListGenerator;

/**
 *
 * @author nonfrt
 */
public class MergeSorter<T> extends Sorter {

    public MergeSorter(ListGenerator<T> listgen) {
        super(listgen);
    }
    
    @Override
    public List<T> sort() {
        return sort(getList());
    }
    
    private List<T> sort(List<T> list) {
        list = new ArrayList<>(list);
        if (list.size() < 2)
            return list;
        
        int middle = list.size()/2;
        List<T> listA = sort(list.subList(0, middle));
        List<T> listB = sort(list.subList(middle, list.size()));
        
        List<T> results = new ArrayList<>();
        int a = 0;
        int b = 0;
        while (a < listA.size() && b < listB.size()) {
            T itemA = listA.get(a);
            T itemB = listB.get(b);
            if (getComparator().compare(itemA, itemB) < 0) {
                results.add(itemA);
                a++;
            } else {
                results.add(itemB);
                b++;
            }
        }
        
        if (a < listA.size())
            results.addAll(listA.subList(a, listA.size()));
        if (b < listB.size())
            results.addAll(listB.subList(b, listB.size()));
        
        return results;
    }
    
}
