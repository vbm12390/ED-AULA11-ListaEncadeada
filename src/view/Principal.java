package view;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import controller.ListaBuilder;

public class Principal {
	
	public static void main(String[] args) {
		List<List<Integer>> listas = new LinkedList<List<Integer>>();
		LinkedList<Integer> listas_unidas = new LinkedList<Integer>();
		
		LinkedList<Integer> lista_crescente = new LinkedList<Integer>();
		LinkedList<Integer> lista_decrescente = new LinkedList<Integer>();
		
		ListaBuilder builder = new ListaBuilder();
		
		int qtd_elementos = Integer.parseInt(
				JOptionPane.showInputDialog("Digite a quantidade de elementos para ser gerado dentro da lista: "));

		for (int i = 0; i < qtd_elementos; i++) {
			builder.gerarlistas();
			builder.concatenarlistas(i);
		}
		listas_unidas = builder.mostrarlista();
		int qtdelementos = Integer.parseInt(JOptionPane.showInputDialog("Quantos elementos você deseja em cada lista ?"));
		listas = builder.dividirlistas(listas_unidas, qtdelementos);
		int tamanho_listas = listas.size();
		for(int i=0; i< tamanho_listas; i++) {
			System.out.println("Lista " + i + " ==>"  + listas.get(i));
		}
		System.out.println("");
		while(true) {
			int index_lista_alvo = Integer.parseInt(JOptionPane.showInputDialog("Qual lista você deseja Ordenar ?"));
			
			if(index_lista_alvo > tamanho_listas ) {
				JOptionPane.showMessageDialog(null, "Lista selecionada não existe");
			}else {
				
				System.out.println("Lista Selecionada ==>" + listas.get(index_lista_alvo));
				listas.get(index_lista_alvo);
			
				lista_crescente = (LinkedList<Integer>) listas.get(index_lista_alvo);
				lista_crescente = builder.bubblesort_crescente(lista_crescente);
				System.out.println("Lista Ordenada Crescente==>" + lista_crescente);
				
				lista_decrescente = (LinkedList<Integer>) listas.get(index_lista_alvo);
				lista_decrescente = builder.bubblesort_decrescente(lista_decrescente);
				System.out.println("Lista Ordenada Decrescente==>" + lista_decrescente);
				
				break;
			}	
		}
	}
}
