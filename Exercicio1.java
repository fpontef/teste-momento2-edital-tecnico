// package esptecnico;

/* Desafio 1 - Área de Atuação V - Programação Nível Técnico
 *  
 *  Escreva um programa que, dado quatro valores, A, B, C e D, imprima o maior 
 *  e o menor valor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Exercicio1 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		Integer a, b, c, d;

		while (true) {
			System.out.println("Informe o número da variável A:");
			a = Integer.valueOf(in.readLine());

			System.out.println("Informe o número da variável B:");
			b = Integer.valueOf(in.readLine());

			System.out.println("Informe o número da variável C:");
			c = Integer.valueOf(in.readLine());

			System.out.println("Informe o número da variável D:");
			d = Integer.valueOf(in.readLine());

			int majorNum = List.of(a, b, c, d).stream().max(Integer::compare).get();
			int minorNum = List.of(a, b, c, d).stream().min(Integer::compare).get();

			System.out.println("O maior número: " + majorNum);
			System.out.println("O menor número: " + minorNum);
			break;
		}
		in.close();
	}
}
