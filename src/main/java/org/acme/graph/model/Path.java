package org.acme.graph.model;

import java.util.ArrayList;
import java.util.List;

public class Path {

    private List<Edge> edges = new ArrayList<>();
    
    public Path(List<Edge> edges) {
        this.edges = edges;
    }

    /**
     * Calculer la longueur des edges
     * 
     * @return double
     */
    public double getLength() {
        double length = 0.0;

        for (Edge e : this.edges) {
            length += e.geometry.getLength();
        }
        return length;
    }
}
