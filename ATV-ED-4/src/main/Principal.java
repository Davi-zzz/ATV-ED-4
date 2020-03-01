package main;

import java.util.Random;
import java.util.Scanner;

import questao1.Vetores;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int controle = 0;

		Vetores qst1 = new Vetores();

		int[] vetor = new int[5];

		for (int i = 0; i < vetor.length; i++) {
			Random gerador = new Random();
			vetor[i] = gerador.nextInt();
			System.out.println(vetor[i]);
		}
		
//		int[] teste = new int[10];
//		
//		for (int i = 0; i < teste.length; i++) {
//			teste[i] = i;
//			System.out.println(teste[i]);
//		}

		while (controle != 4) {
			System.out.println("");
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
			case 3:{
				System.out.println(qst1.somaDosItensRS(vetor.length, vetor));
				
			}

			}
		}
	}

}
