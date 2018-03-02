/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms.pathfinder;

import javaalgorithms.datastructures.graph.Graph;
import javaalgorithms.datastructures.graph.Vertex;

/**
 *
 * @author nonfrt
 */
public interface Pathfinder {
    public void setGraph(Graph graph, Vertex start, Vertex stop);
    public Path getPath();
}
