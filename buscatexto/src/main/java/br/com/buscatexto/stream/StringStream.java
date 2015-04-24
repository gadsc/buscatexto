package br.com.buscatexto.stream;

import org.apache.commons.lang.StringUtils;

public class StringStream implements Stream {
	private String input;
	private char[] inputArray;
	private int contador;

	public StringStream(String input) {
		contador = 0;
		this.input = input;
		this.inputArray = StringUtils.isBlank(input) ? new char[0] : input
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
