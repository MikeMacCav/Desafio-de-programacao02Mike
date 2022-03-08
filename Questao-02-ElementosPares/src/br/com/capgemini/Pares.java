package br.com.capgemini;

import java.util.Scanner;

public class Pares {


public static void main(String[] args) {
	 
	try (Scanner sc = new Scanner(System.in)) {
		int count = 0;		
		
		int[] vetor = { 1, 5, 3, 4, 2 };		
		
		System.out.println("Digite um valor para x: ");
        int X = sc.nextInt();

        for (int i1 = 0; i1 < vetor.length; i1++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i1] - vetor[j] == X) { count++; }
            }
        }
        System.out.println("O número de elementos pares é: "+count);
    }
}
}