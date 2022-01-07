package org.acme.graph.model;

import org.acme.graph.TestGraphFactory;
import org.junit.Assert;
import org.junit.Test;

public class PathTest {

    public static final double EPSILON = 1.0e-15;

    @Test
	public void testlength(){

        Graph g = TestGraphFactory.createGraph01();
        Vertex v = g.findVertex("a");
        Path p = new Path(g.getInEdges(v));
		Assert.assertEquals(0.0, p.getLength(), EPSILON);
	}
    
}
