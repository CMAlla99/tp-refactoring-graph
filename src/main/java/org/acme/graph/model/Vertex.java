package org.acme.graph.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.locationtech.jts.geom.Coordinate;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Un sommet dans un graphe
 * 
 * @author MBorne
 *
 */
public class Vertex {

	/**
	 * Identifiant du sommet
	 */
	private String id;

	/**
	 * Position du sommet
	 */
	private Coordinate coordinate;

	/**
	 * dijkstra - liste des arcs entrants 
	 */
	@JsonIgnore
	private List<Edge> inEdges = new ArrayList<>();;

	/**
	 * dijkstra - liste des arcs sortants 
	 */
	@JsonIgnore
	private List<Edge> outEdges = new ArrayList<>();;

	Vertex() {
	}

	public Vertex(Coordinate coordinate, String id) {
		this.coordinate = coordinate;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public List<Edge> getInEdges() {
		return inEdges;
	}

	public List<Edge> getOutEdges() {
		return outEdges;
	}

	@Override
	public String toString() {
		return id;
	}

}
