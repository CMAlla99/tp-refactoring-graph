package org.acme.graph.model;

import org.junit.Assert;
import org.junit.Test;

public class EdgeTest {

    @Test
	public void testConstructor(){

        Vertex v1 = new Vertex();
        Vertex v2 = new Vertex();
		Edge e = new Edge(v1, v2);
		Assert.assertEquals(v1, e.getSource());
		Assert.assertEquals(v2, e.getTarget());
	}
    
}
