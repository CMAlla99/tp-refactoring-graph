package org.acme.graph.model;

import org.acme.graph.TestGraphFactory;
import org.junit.Assert;
import org.junit.Test;

public class PathThreeTest {
    
    @Test
	public void testConstructor(){

        Graph g = TestGraphFactory.createGraph01();
        PathThree pathThree = new PathThree(g, g.findVertex("a"));
		Assert.assertTrue(null != pathThree);
	} 
}
