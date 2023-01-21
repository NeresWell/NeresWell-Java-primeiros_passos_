package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		// Offer e add -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana"); // restrição de tamanho = erro
		fila.offer("Bia"); // true false
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// Peek e element -> obter o proximo elementos da fila (sem remover)
		// Diferença é o comportamento ocorre quando a fila esta vazia!
		System.out.println(fila.peek()); // null se a fila estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); // erro se a fila estiver vazia
		System.out.println(fila.element());

		// Poll e remove -> obter o proximo elemento da fila e remove!
		// diferença é o comportamento ocorre quando a fila está vazia!
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // lança exceção

		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...);
	}
}
