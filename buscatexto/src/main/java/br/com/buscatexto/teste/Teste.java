package br.com.buscatexto.teste;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

public class Teste {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String texto = "inconstitucionalicimamente".toLowerCase();
		char[] textoArray = texto.toCharArray();
		boolean achouPrimeiraLetra = false;

		for (int i = 0; i < textoArray.length; i++) {
			if (!achouPrimeiraLetra
					&& StringUtils.countMatches(texto,
							String.valueOf(textoArray[i])) == NumberUtils.INTEGER_ONE) {
				System.out.println(textoArray[i]);
				achouPrimeiraLetra = true;
			}
		}

		String teste = Teste
				.getStringAsList(texto)
				.stream()
				.filter(s -> StringUtils.countMatches(texto, s) == NumberUtils.INTEGER_ONE)
				.limit(1).findFirst().get();

		System.out.println(teste);
	}

	public static List<String> getStringAsList(String palavra) {
		List<String> palavraAsList = new ArrayList<String>();
		palavra = palavra.toLowerCase();

		for (char letra : palavra.toCharArray()) {
			palavraAsList.add(String.valueOf(letra));
		}

		return palavraAsList;
	}
}
