/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms;

import javaalgorithms.algorithms.sort.BubbleSorter;
import javaalgorithms.algorithms.sort.DefaultSorter;
import javaalgorithms.algorithms.sort.InsertionSorter;
import javaalgorithms.algorithms.sort.QuickIndexSorter;
import javaalgorithms.algorithms.sort.QuickObjectSorter;
import javaalgorithms.algorithms.sort.SortTimer;
import javaalgorithms.algorithms.sort.Sorter;
import javaalgorithms.generators.IntegerListGenerator;
import javaalgorithms.generators.ListGenerator;

/**
 *
 * @author nonfrt
 */
public class JavaAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size = 20;
        int iter = 20;
        ListGenerator listorator = new IntegerListGenerator(size);
        SortTimer timer = new SortTimer(iter);
        
        // Sort Algos
        Sorter qos = new QuickObjectSorter(listorator);
        Sorter qis = new QuickIndexSorter(listorator);
        Sorter is = new InsertionSorter(listorator);
        Sorter bs = new BubbleSorter(listorator);
        Sorter ds = new DefaultSorter(listorator);

        // Get Results
        System.out.println(timer.timeIt(qos)+" nanoseconds for Quick Object Sort");
        System.out.println(timer.timeIt(qis)+" nanoseconds for Quick Index Sort");
        System.out.println(timer.timeIt(is)+" nanoseconds for Insertion Sort");
        System.out.println(timer.timeIt(bs)+" nanoseconds for Bubble Sort");
        System.out.println(timer.timeIt(ds)+" nanoseconds for Default Sort");
    }
    
}
