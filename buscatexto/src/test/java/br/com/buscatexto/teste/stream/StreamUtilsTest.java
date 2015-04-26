package br.com.buscatexto.teste.stream;

import junit.framework.TestCase;

import org.junit.Test;

import br.com.buscatexto.stream.Stream;
import br.com.buscatexto.stream.impl.StringStream;
import br.com.buscatexto.stream.service.StreamUtils;

/**
 * Classe para testar o método da classe utilitária que traz a primeira letra
 * não repetida de uma Stream
 * 
 * @author Gabz
 *
 */
public class StreamUtilsTest extends TestCase {
	private Stream input;

	protected void setUp() throws Exception {
		super.setUp();
		input = new StringStream("google");
	}

	@Test
	public void testFirstChar() {
		assertEquals("l".charAt(0), StreamUtils.firstChar(input));
	}
}
