/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.generators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author nonfrt
 */
public class IntegerListGenerator implements ListGenerator<Integer> {

    private final Integer size;
    private final Random random;
    
    public IntegerListGenerator(Integer size) {
        this.size = size;
        random = new Random();
    }
    
    @Override
    public List<Integer> get() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++)
            list.add(random.nextInt(size));
        return list;
    }
    
    @Override
    public Comparator<Integer> comparator() {
        return (x,y) -> x-y;
    }
}
