package br.com.buscatexto.teste;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

import br.com.buscatexto.stream.Stream;
import br.com.buscatexto.stream.StringStream;

public class TesteStream {
	public static void main(String[] args) throws IOException {
		Stream input = new StringStream("google");
		System.out.println(TesteStream.firstChar(input));
	}

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