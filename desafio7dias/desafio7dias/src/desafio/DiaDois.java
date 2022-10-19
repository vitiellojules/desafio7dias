package desafio;

import java.util.ArrayList;
import java.util.Scanner;


public class DiaDois {
	  int sum = 0, j = 0;
	 
	  public static void main(String[]args)
	  {
	    int n;
	    @SuppressWarnings("resource")
		Scanner NovoNumero = new Scanner(System.in);
	    System.out.print(" digite a quantidade de numero voce quer adicionar no Array :");
	    n = NovoNumero.nextInt();
	    System.out.println(" digite os numeros :");
	    ArrayList < Integer > lista = new ArrayList < Integer > ();
	    lista.add(10);
	    lista.add(90);
	    lista.add(30);
	    lista.add(40);
	    lista.add(70);
	    lista.add(100);
	    lista.add(0);
	     
	    System.out.println(" os elemento da lista : " + lista);
	    for (int i = 0; i < n; i++)
	    {
	      lista.add(NovoNumero.nextInt());
	    }
	   
	    Integer[] Array = lista.toArray(new Integer[lista.size()]);
	    DiaDois elementos = new DiaDois();
	 
	    int x = elementos.add(Array, Array.length, 0);
	    System.out.println("  Soma dos elementos da lista e :" + x);
	  }
	 
	  int add(Integer arr[], int n, int i)
	  {
	    if(i < n)
	    {
	        return arr[i] + add(arr, n, ++i);
	    }
	    else
	    {
	        return 0;
	    }
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
		System.out.println(" ");
	Scanner ler = new Scanner(System.in);
	int[] numeros = new int[10];
	for (int i = 0; i < numeros.length; i++) {
		numeros[i] = Integer.valueOf(ler.nextLine());
		if (numeros[i] <= 0) {
			System.out.println(" numero invalido digite outro!!\n");
			i--;

		}
	}

	for (int i = 0; i < numeros.length; i++) {
		System.out.printf("numeros: %d\n", numeros[i]);
	}

	System.out.printf("Soma do vetor: %.2f", calcula_Soma(numeros));

}

public static double calcula_Soma(int[] numeros) {
	int soma = 0;
	for (int i = 0; i < numeros.length; i++) {
		soma += numeros[i];

	}
	return soma ;

}



}

	
	public static void main(String[] args) {
		
		int n = lerInt("Quantidade de alunos:");
		String[] nomes = new String[n];
		double[] notas = new double[n];
		double soma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			String nome = lerInt("Aluno " + (i + 1));
			double nota = lerDouble("Nota de " + nome);
			soma += nota;
			nomes[i] = nome;
			notas[i] = nota;
		}
		double media = soma/n;
		println("Nota media da turma: " + media);
		println("Alunos com media maior que "+media);
		
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= media) {
				println(nomes[i] + " - " +notas[i]);
			}
		}
	}

	private static void println(String string) {
		// TODO Auto-generated method stub
		
	}

	private static double lerDouble(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static String lerInt(String string) {
		// TODO Auto-generated method stub
		return 0;
*/	}
	
	
	

	

		
	



