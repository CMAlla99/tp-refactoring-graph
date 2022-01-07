package org.acme.graph.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Un path matérialisé par une liste d'arc
 */
public class Path {

    private List<Edge> edges = new ArrayList<>();
    
    public Path(List<Edge> edges) {
        this.edges = edges;
    }

    /**
     *  Renvoyer la liste des arcs
     * 
     * @return
     */
    public List<Edge> getEdges() {
        return this.edges;
    }

    /**
     * Calculer la longueur des edges
     * 
     * @return double
     */
    public double getLength() {
        double length = 0.0;

        for (Edge e : this.edges) {
            length += e.getCost();
        }
        return length;
    }
}
