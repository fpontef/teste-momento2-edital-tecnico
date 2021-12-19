// package esptecnico;

import java.util.Scanner;

/* Desafio 2 - Área de Atuação V - Programação Nível Técnico
 * Dados três valores distintos, fazer um algoritmo que, após a leitura 
 * destes dados imprima-os em ordem crescente.
 * 
 * Solução alternativa seria usar api da linguagem Java para ordenação e 
 * lista mas optei por seguir usando primitivos onde possível.
 */

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numVet[] = new int[3];
		int count = 0;

		while (true) {
			if (count == 3)
				break;

			System.out.println("Informe a " + (count + 1) + "a variável: ");
			int input = scan.nextInt();

			if (contains(numVet, input)) {
				System.out.println("Já existe, informe outro valor.");
				continue;
			}

			numVet[count] = input;
			count++;
		}
		scan.close();

		sort(numVet);
		System.out.println("Ordenado: " + printVet(numVet));

	}

	static boolean contains(int[] vet, int value) {
		boolean result = false;
		for (int n : vet) {
			if (n == value) {
				result = true;
				break;
			}
		}
		return result;
	}

	static int[] sort(int[] vetor) {
		for (int last = vetor.length - 1; last > 0; last--) {
			for (int i = 0; i < last; i++) {
				if (vetor[i] > vetor[i + 1]) {
					var aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
				}
			}
		}
		return vetor;
	}

	static String printVet(int[] vetor) {
		String vetorString = new String();

		for (int n : vetor) {
			vetorString += String.valueOf("[ " + n + " ]");
		}
		return vetorString;
	}

}
