// package esptecnico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Desafio 2 - Área de Atuação V - Programação Nível Técnico
 * Faça um algoritmo que leia um número inteiro e mostre uma mensagem 
 * indicando se este número é par ou ímpar, e se é positivo ou negativo.
*/

public class Exercicio3 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		Integer num = null;

		System.out.println("O zero será testado, mas também sairá do loop.");
		do {

			System.out.println("Escreva um número inteiro para testar: ");

			num = Integer.valueOf(in.readLine());
			System.out.println("O número " + num + " é " + isEven(num) + " e " + isPositive(num));

		} while (!num.equals(0));

		in.close();
	}

	static String isEven(int n) {
		if (n % 2 == 0)
			return "par";
		return "impar";
	}

	static String isPositive(int n) {
		if (n == 0)
			return "neutro";
		if (n > 0)
			return "positivo";
		return "negativo";
	}
}
