package br.com.buscatexto.stream;

/**
 * @author Gabz
 *
 */
public interface Stream {
	/**
	 * Método para retornar o próximo elemento
	 * 
	 * @return
	 */
	char getNext();
	
	
	/**
	 * Método para verificar se existe próximo elemento
	 * 
	 * @return
	 */
	boolean hasNext();
}
