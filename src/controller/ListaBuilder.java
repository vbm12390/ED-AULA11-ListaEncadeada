package controller;

import java.util.LinkedList;
import java.util.List;

public class ListaBuilder {
	
	LinkedList<Integer> lista1 = new LinkedList<Integer>();
	LinkedList<Integer> lista2 = new LinkedList<Integer>();
	LinkedList<Integer> listas_unidas = new LinkedList<Integer>();

	public void gerarlistas() {
		int elemento = (int) (Math.random() * 101);
		lista1.add(elemento);
		elemento = (int) (Math.random() * 101);
		lista2.add(elemento);
	}

	public void concatenarlistas(int posicao) {
		listas_unidas.add(lista1.get(posicao));
		listas_unidas.add(lista2.get(posicao));
	}

	public LinkedList<Integer> mostrarlista() {
		System.out.println("Lista 1 ==>" + lista1.toString() + "\n");
		System.out.println("Lista 2 ==>" + lista2.toString() + "\n");
		System.out.println("Lista Unidas(Interlando numeros)==>" + listas_unidas.toString() + "\n");
		return listas_unidas;

	}

	public List<List<Integer>> dividirlistas(List<Integer> list, int splitBy) {
		List<List<Integer>> listas = new LinkedList<List<Integer>>();
		int listSize = list.size();
		if (listSize / splitBy < 1) {
			throw new Error("Não é possível dividir a lista por " + splitBy);
		}
		for (int i = 0; i < listSize; i += splitBy) {
			listas.add(new LinkedList<Integer>(list.subList(i, Math.min(listSize, i + splitBy))));
		}
		System.out.println("Listas Divididas");
		System.out.println(listas + "\n");
		return listas;
	}

	public LinkedList<Integer> bubblesort_crescente(LinkedList<Integer> lista_crescente) {
		int tamanho = lista_crescente.size();
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho - 1; j++) {
				int numero1 = lista_crescente.get(j);
				int numero2 = lista_crescente.get(j + 1);
				if (numero1 > numero2) {
					int aux = numero1;
					// lista.add(j, new No(Integer.toString(numero2)));
					lista_crescente.remove(j);
					lista_crescente.add(j, numero2);
					// lista_crescente.adicionaPosicao(j+1, new No(Integer.toString(aux)));
					lista_crescente.remove(j + 1);
					lista_crescente.add(j + 1, aux);
				}
			}
		}
		return lista_crescente;
	}

	public LinkedList<Integer> bubblesort_decrescente(LinkedList<Integer> lista_decrescente) {
		
		int tamanho = lista_decrescente.size();
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho - 1; j++) {
				int numero1 = lista_decrescente.get(j);
				int numero2 = lista_decrescente.get(j + 1);
				if (numero1 < numero2) {
					int aux = numero1;
					// lista.add(j, new No(Integer.toString(numero2)));
					lista_decrescente.remove(j);
					lista_decrescente.add(j, numero2);
					// lista_crescente.adicionaPosicao(j+1, new No(Integer.toString(aux)));
					lista_decrescente.remove(j + 1);
					lista_decrescente.add(j + 1, aux);
				}
			}
		}

		return lista_decrescente;
	}
}
