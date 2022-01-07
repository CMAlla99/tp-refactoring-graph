package org.acme.graph.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

/**
 * Arbre de plus court chemin
 */
public class PathThree {

    private Vertex origin;

    private Map<Vertex,PathNode> nodes;

    private Graph graph;

    public PathThree(Graph graph, Vertex origin) {
        
        this.graph = graph;
        this.origin = origin;

		this.nodes = new HashMap<>();

		for (Vertex vertex : this.graph.getVertices()) {
			PathNode p = new PathNode();
			p.setCost(this.origin == vertex ? 0.0 : Double.POSITIVE_INFINITY);
			p.setReachingEdge(null);
			p.setVisited(false);
			nodes.put(vertex, p);
		}
    }

    /**
	 * Construit le chemin en remontant les relations incoming edge
	 * 
	 * @param destination
	 * @return
	 */
	public Path getPath(Vertex destination) {
		List<Edge> result = new ArrayList<>();

		Edge current = getNode(destination).getReachingEdge();
		do {
			result.add(current);
			current = getNode(current.getSource()).getReachingEdge();
		} while (current != null);

		Collections.reverse(result);
		return new Path(result);
	}

    /**
	 * Convertir un vertex en PathNode
	 * 
	 * @param vertex
	 * @return
	 */
	public PathNode getNode(Vertex vertex) {
		return nodes.get(vertex);
	}
}
