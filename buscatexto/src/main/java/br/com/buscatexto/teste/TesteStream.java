package br.com.buscatexto.teste;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

import br.com.buscatexto.stream.Stream;
import br.com.buscatexto.stream.StringStream;

public class TesteStream {
	public static void main(String[] args) throws IOException {
		Stream stream = new StringStream("google");

		boolean achou = false;
		while (!achou && stream.hasNext()) {
			char caracterAtual = stream.getNext();
			if (StringUtils.countMatches(stream.toString(),
					String.valueOf(caracterAtual)) == NumberUtils.INTEGER_ONE) {
				System.out.println(caracterAtual);
				achou = true;
			}
		}
	}
}