package questao1;

import java.math.BigInteger;
import java.util.Random;

public class Vetores {

//=====================================================================================================//
	public int verificaMaiorVetor(int runner, int[] vetor) {
		int maiorNum;
		
		
		if (runner == 1) {
			maiorNum = vetor[runner-1];
			
		}
		else {
			maiorNum = verificaMaiorVetor(runner-1, vetor);
			if(maiorNum < vetor[runner-1]) {
				maiorNum = vetor[runner-1];
				
			}
		}
		return maiorNum;
	}
//=====================================================================================================//
	public int verificaMenorVetor(int runner, int[] vetor) {
		int menorNum;
		
		if (runner == 1) {
			menorNum = vetor[runner-1];
		}
		
		else {
			menorNum = verificaMenorVetor(runner-1, vetor);
			if(menorNum > vetor[runner-1]) {
				menorNum = vetor[runner-1];
			}
		}
		return menorNum;
	}
//=====================================================================================================//
	public static int somaDosItensRS(int runner, int[] vetor) {
		
		int total;
		total = vetor[runner-1];
		
		if (runner != vetor.length-vetor.length+1) {
			total = total + somaDosItensRS(runner-1, vetor);
		}
		return total;
	}
//=====================================================================================================//
	public static int somaDosItensRB(int runner, int[] vetor) {
		 int total; 
		 //TENTEI DE TODAS AS FORMAS E NÃO CONSEGUI :=(
	}		 
//=====================================================================================================//
	public static BigInteger fiboSimple(int n,BigInteger[] f) {
		
		if (n == 0) {
			f[0] = BigInteger.valueOf(0);			
			n++;
			return fiboSimple(n, f);
		}
		else if(n == 1) {
			f[1] = BigInteger.valueOf(1);
			n++;
			return fiboSimple(n, f);
		}
		else {
			if (n == f.length-1) {
				return f[n] = f[n-1].add(f[n-2]);
			}
			f[n] = f[n-1].add(f[n-2]);
			n++;
			return fiboSimple(n, f);
			
		}
	}
}

	