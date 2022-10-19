package desafio7dias;

import java.util.ArrayList;
import java.util.Scanner;

public class DiaQuatro {

	public static void main (String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		for (int i = 1; i < 4; i++) {
		    System.out.println("Digite a sua nota  " + i + " n1: ");
		    numeros.add(scanner.nextInt());
		}

		double soma = 0;
		for (Integer n : numeros) {
		    soma += n.intValue();
		 
		}
		
		System.out.println(" A Soma: " + soma);
		
}}