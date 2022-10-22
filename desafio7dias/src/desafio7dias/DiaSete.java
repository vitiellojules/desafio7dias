package desafio7dias;

public class DiaSete {
	
	static void  verificar(int[]array1, int[]array2)
	  {
	  boolean  igual = true;
	  
	  if(array1.length == array2.length)
	  {
	  for (int i  = 0; i < array1.length; i++)
	  {
	  if(array1[i] != array2[i])
	  {
	  igual= false;
	  }
	  }
	  }
	  else
	  {
	  igual  = false;
	  }
	  
	  if  (igual)
	  {
	  System.out.println(" dois array sao iguais.");
	  }
	  else
	  {
	  System.out.println(" doois array não sao iguais.");
	  }
	  }
	  
	  public static void  main(String[] args)
	  {
	  int[] array1 =  {2, 5, 7, 9, 11};
	  int[] array2 =  {2, 5, 7, 8, 11};
	  int[] array3 =  {2, 5, 7, 9, 11};
	  
	  verificar(array1,  array2);
	  verificar(array1, array3);
	  }
	  }


