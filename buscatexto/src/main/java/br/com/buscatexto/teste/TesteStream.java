package br.com.buscatexto.teste;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

import br.com.buscatexto.stream.Stream;
import br.com.buscatexto.stream.StringStream;

public class TesteStream {
	public static void main(String[] args) throws IOException {
		Stream str = new StringStream("google");

		boolean achou = false;
		while (!achou && str.hasNext()) {
			char atual = str.getNext();
			if (StringUtils.countMatches(str.toString(), String.valueOf(atual)) == NumberUtils.INTEGER_ONE) {
				System.out.println(atual);
				achou = true;
			}
		}
	}
}