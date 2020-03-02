package main;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

import questao1.Vetores;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int controle = 0;
		BigInteger[] f = new BigInteger[100];
		Vetores qst1 = new Vetores();
		qst1.fiboSimple(0, f);
		int[] vetor = new int[100];

		for (int i = 0; i < vetor.length; i++) {
			Random gerador = new Random();
			vetor[i] = gerador.nextInt();
		}

		while (controle != 6) {
			System.out.println("|====================================================================|");
			System.out.println("|=====1 IMPRIME O MAIOR NUMERO DO VETOR COM NUMEROS ALEATÓRIOS=======|");
			System.out.println("|=====2 IMPRIME O MENOR NUMERO DO VETOR COM NUMEROS ALEATÓRIOS=======|");
			System.out.println("|=====3 IMPRIME A SOMA DE TODOS OS ITENS DO VETOR ALEATÓRIOS=========|");
			System.out.println("|=====4 IMPRIME O MAIOR NUMERO DO VETOR COM NUMEROS ALEATÓRIOS=======|");
			System.out.println("|=====5 IMPRIME TODOS OS 100 VALORES DA SEQUENCIA FIBONACCI==========|");
			System.out.println("|=====6 IMPRIME UMA POSIÇÃO DA SUA ESCOLHA DA SEQUENCIA FIBONACCI====|");
			System.out.println("|====================================================================|");
			controle = scan.nextInt();
			switch (controle) {
			case 1: {
				System.out.println(qst1.verificaMaiorVetor(vetor.length, vetor));
				break;
			}
			case 2: {
				System.out.println(qst1.verificaMenorVetor(vetor.length, vetor));
				break;
			}
			case 3: {
				System.out.println(qst1.somaDosItensRS(vetor.length, vetor));
				break;

			}
			case 4: {

				for (int i = 0; i < f.length; i++) {
					System.out.println(f[i]);
				}
				break;
			}
			case 5: {
				System.out.println("DIGITE A POSIÇÃO DA CADEIA FIBONACCI QUE VOCE DESEJA IMPRMIR: ");
				System.out.println(f[scan.nextInt()]);
				break;
			}
			case 6: {
				System.out.println("A-D-I-O-S");
				System.out.println("¯\\_(ツ)_/¯");

			}

			}
		}
	}
}
