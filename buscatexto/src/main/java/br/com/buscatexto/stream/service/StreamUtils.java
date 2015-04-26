package br.com.buscatexto.stream.service;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

import br.com.buscatexto.stream.Stream;

/**
 * Classe utilitária para a interface Stream
 * 
 * @author Gabz
 *
 */
public class StreamUtils {
	/**
	 * Método que retorna o primeiro caracter não repetido dado uma stream
	 * 
	 * @param input
	 *            stream para busca
	 * @return primeiro caracter não repetido da palavra
	 */
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