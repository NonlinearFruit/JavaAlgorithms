/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms;

import java.util.Random;
import javaalgorithms.algorithms.primality.MillerRabinPrimality;
import javaalgorithms.algorithms.primality.Primality;
import javaalgorithms.algorithms.primality.PrimeTimer;
import javaalgorithms.algorithms.primality.SquareRootPrimality;
import javaalgorithms.algorithms.sort.BubbleSorter;
import javaalgorithms.algorithms.sort.DefaultSorter;
import javaalgorithms.algorithms.sort.InsertionSorter;
import javaalgorithms.algorithms.sort.MergeSorter;
import javaalgorithms.algorithms.sort.QuickIndexSorter;
import javaalgorithms.algorithms.sort.QuickObjectSorter;
import javaalgorithms.algorithms.sort.SortTimer;
import javaalgorithms.algorithms.sort.Sorter;
import javaalgorithms.generators.ListGenerator;
import javaalgorithms.generators.WordListGenerator;

/**
 *
 * @author nonfrt
 */
public class JavaAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iter = 1000;
        PrimeTimer timer = new PrimeTimer(iter);
        
        // Primalities
        Primality rm = new MillerRabinPrimality();
        Primality sr = new SquareRootPrimality();
        
        rm.getPrimesBelow(100000000);
    }
    
    public static void sortComparison() {
        int size = 40;
        int iter = 100;
        ListGenerator listorator = new WordListGenerator(size);
        SortTimer timer = new SortTimer(iter);
        
        // Sort Algos
        Sorter qos = new QuickObjectSorter(listorator);
        Sorter qis = new QuickIndexSorter(listorator);
        Sorter is = new InsertionSorter(listorator);
        Sorter bs = new BubbleSorter(listorator);
        Sorter ds = new DefaultSorter(listorator);
        Sorter ms = new MergeSorter(listorator);

        // Get Results
        System.out.println(String.format("%1$" + 10 + "s", timer.timeIt(qos))+" nanoseconds for Quick Object Sort");
        System.out.println(String.format("%1$" + 10 + "s", timer.timeIt(qis))+" nanoseconds for Quick Index Sort");
        System.out.println(String.format("%1$" + 10 + "s", timer.timeIt(is))+" nanoseconds for Insertion Sort");
        System.out.println(String.format("%1$" + 10 + "s", timer.timeIt(bs))+" nanoseconds for Bubble Sort");
        System.out.println(String.format("%1$" + 10 + "s", timer.timeIt(ds))+" nanoseconds for Default Sort");
        System.out.println(String.format("%1$" + 10 + "s", timer.timeIt(ms))+" nanoseconds for Merge Sort");
    }
    
}
