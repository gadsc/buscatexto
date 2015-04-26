package br.com.buscatexto.stream;

/**
 * @author Gabz
 *
 */
public interface Stream {
	/**
	 * Método para retornar o próximo elemento
	 * 
	 * @return char próximo elemento
	 */
	char getNext();

	/**
	 * Método para verificar se existe próximo elemento
	 * 
	 * @return true se existir outro elemento e false se não existir
	 */
	boolean hasNext();
}
