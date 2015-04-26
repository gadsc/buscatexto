package br.com.buscatexto.teste.stream;

import junit.framework.TestCase;

import org.junit.Test;

import br.com.buscatexto.stream.Stream;
import br.com.buscatexto.stream.impl.StringStream;

public class StreamTest extends TestCase {
	private Stream input;
	
	protected void setUp() throws Exception {
        super.setUp();
        input = new StringStream("google");
    }
	
	@Test
	public void testGetNext() {
		assertEquals("g".charAt(0), input.getNext());
	}
	
	@Test
	public void testHasNext() {
		assertTrue(input.hasNext());
	}
}
