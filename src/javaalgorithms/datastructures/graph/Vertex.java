/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithms.datastructures.graph;

/**
 * Vertices for graphs
 * @author nonfrt
 */
public class Vertex {
    private Integer cost;
    
    public Vertex() {
        this(1);
    }
    
    public Vertex(Integer cost) {
        this.cost = cost;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
