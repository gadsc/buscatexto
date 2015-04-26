package br.com.buscatexto.stream.impl;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

import br.com.buscatexto.stream.Stream;

/**
 * Classe que implementa a interface Stream
 * 
 * @author Gabz
 *
 */
public class StringStream implements Stream {
	private String input;
	private char[] inputArray;
	private int contador;

	public StringStream(String input) {
		contador = NumberUtils.INTEGER_ZERO;
		this.input = input;
		this.inputArray = StringUtils.isBlank(input) ? new char[NumberUtils.INTEGER_ZERO] : input
				.toCharArray();
	}

	@Override
	public char getNext() {
		char value = inputArray[contador];
		contador++;
		return value;
	}

	@Override
	public boolean hasNext() {
		return contador < inputArray.length;
	}

	@Override
	public String toString() {
		return input;
	}
}
