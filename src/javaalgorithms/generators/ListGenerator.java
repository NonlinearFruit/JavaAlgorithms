/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.generators;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author nonfrt
 */
public interface ListGenerator<T> {
    public List<T> get();
    public Comparator<T> comparator();
}
