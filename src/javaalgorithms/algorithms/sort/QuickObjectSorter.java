/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javaalgorithms.generators.ListGenerator;

/**
 * Quick sort that is passing around objects instead of indices.
 * @author nonfrt
 */
public class QuickObjectSorter<T> extends Sorter<T>{
    
    public QuickObjectSorter(ListGenerator<T> listgen) {
        super(listgen);
    }
    
    @Override
    public List<T> sort() {
        return sort(getList());
    }
    
    private List<T> sort(List<T> list) {
        if (list.size() < 2)
            return list;
        T pivot = list.get(0);
        List<T> lower = new ArrayList<>();
        List<T> higher = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            T element = list.get(i);
            if (getComparator().compare(pivot, element) > 0)
                lower.add(element);
            else
                higher.add(element);
        }
        lower = sort(lower);
        lower.add(pivot);
        higher = sort(higher);
        return Stream.concat(lower.stream(), higher.stream())
                .collect(Collectors.toList());
    }
}
