package desafio;

import java.util.ArrayList;

public class DiaUm {
	
	public static void main(String[] args)
		    {
			ArrayList <String> lista = new ArrayList <String> ();  
			
			lista.add(" Meu ");  
			lista.add(" primeiro ");  
			lista.add(" exercicio");  
			lista.add(" no desafio de  7 dias");   
			int list_size = lista.size();  
			String[] strArray = new String[list_size];  
		
			lista.toArray(strArray);  
			for(int i = 0; i < strArray.length; i++) {  
			System.out.print(strArray[i]);  
			}  
			}  
			
		       
		    }
		
		


