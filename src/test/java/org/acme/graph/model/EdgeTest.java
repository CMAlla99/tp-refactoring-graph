package org.acme.graph.model;

import org.junit.Assert;
import org.junit.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.LineString;

public class EdgeTest {

	public static final double EPSILON = 1.0e-15;

    @Test
	public void testConstructor(){

        Vertex v1 = new Vertex(new Coordinate(1.0, 1.0), "1");
        Vertex v2 = new Vertex(new Coordinate(3.0, 1.0), "2");
		Edge e = new Edge(v1, v2);
		Assert.assertEquals(v1, e.getSource());
		Assert.assertEquals(v2, e.getTarget());
	}

	@Test
	public void testgetCost() {
		Vertex v1 = new Vertex(new Coordinate(1.0, 1.0), "1");
        Vertex v2 = new Vertex(new Coordinate(3.0, 1.0), "2");
		Edge e = new Edge(v1, v2);
		Assert.assertEquals(0.0, e.getCost(), EPSILON);
	}

	@Test
	public void testgetGeometry() {
		Vertex v1 = new Vertex(new Coordinate(1.0, 1.0), "1");
        Vertex v2 = new Vertex(new Coordinate(3.0, 1.0), "2");
		Edge e = new Edge(v1, v2);
		Assert.assertTrue(e.getGeometry() != null);
	}
    
}
