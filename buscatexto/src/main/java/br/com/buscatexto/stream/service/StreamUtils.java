package br.com.buscatexto.stream.service;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

import br.com.buscatexto.stream.Stream;

public class StreamUtils {
	public static char firstChar(Stream input) {
		boolean achou = false;
		char primeiroCaracterNaoRepetido = Character.MIN_VALUE;

		while (!achou && input.hasNext()) {
			char caracterAtual = input.getNext();

			if (StringUtils.countMatches(input.toString(),
					String.valueOf(caracterAtual)) == NumberUtils.INTEGER_ONE) {
				primeiroCaracterNaoRepetido = caracterAtual;
				achou = true;
			}
		}

		return primeiroCaracterNaoRepetido;
	}
}