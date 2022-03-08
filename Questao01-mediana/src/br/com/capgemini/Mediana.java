package br.com.capgemini;
import java.util.*;

class Mediana {

 public static double findmediana(int vetor[], int n) // fun��o de c�lculo da mediana
 {  
     	Arrays.sort(vetor);     
     			if (n % 2 != 0)
     				return (double)vetor[n/2];
     					return (double)(vetor[(n-1)/2] + vetor[n/2]) / 2.0;
 }
 
 public static void main(String args[])
 {
     int vetor[] = {9, 2, 1, 4, 6};
     int n = vetor.length;
     System.out.println("A mediana do vetor � = " + findmediana(vetor, n));
 }
}