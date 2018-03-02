/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.algorithms.pathfinder;

import java.util.ArrayList;
import java.util.List;
import javaalgorithms.datastructures.graph.Vertex;

/**
 *
 * @author nonfrt
 */
public class Path {
    private List<Vertex> list;
    private Integer cost;
    
    public Path() {
        list = new ArrayList<>();
        cost = 0;
    }
    
    public Path(Vertex start) {
        this();
        addVertex(start);
    }
    
    public void addVertex(Vertex vertex) {
        list.add(vertex);
        cost += vertex.getCost();
    }
    
    public void insertVertex(Vertex vertex, Integer place) {
        list.add(place, vertex);
        cost += vertex.getCost();
    }
    
    public void removeVertex(Vertex vertex) {
        if (list.contains(vertex)) {
            list.remove(vertex);
            cost -= vertex.getCost();
        }
    }
    
    public void removeVertex(Integer place) {
        if (place > -1 && place < getLength()) {
            removeVertex(getVertex(place));
        }
    }
    
    public Integer getCost() {
        return cost;
    }
    
    public Integer getLength() {
        return list.size();
    }
    
    public Vertex head() {
        return getVertex(0);
    }
    
    public Vertex tail() {
        return getVertex(getLength()-1);
    }
    
    public Vertex getVertex(Integer place) {
        return list.get(place);
    }
}
