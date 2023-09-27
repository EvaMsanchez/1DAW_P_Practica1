package es.studium.ejercicios;

import java.util.Scanner;

public class OrdenacionInsercion
{

	public static void main(String[] args)
	{
		final int MAX = 10;  //Declarar la dimensión de la tabla (huecos).
		
		char tabla [] = new char [MAX];  //Tipo variable del contenido y crear tabla.
		int i, j;
		char ordenado;
				
		Scanner teclado = new Scanner (System.in);
		
		//Pedir e introducir los valores en la tabla.
		for (i=0; i<MAX; i++)
		{
			System.out.println("Dame el carácter de la posición "+i+" :");
			tabla[i] = teclado.nextLine().charAt(0);
		}
		teclado.close();
		
		
		for (i=0; i<MAX; i++)
		{
			j = i;
			ordenado = tabla [i];
			
			while ((j>0)&&(ordenado<tabla[j-1])) //Posición.
			{
				tabla[j] = tabla[j-1];
				j=j-1;
			}
			
			tabla[j] = ordenado;  //Se pasa los carácteres ordenados a la tabla.
		}
		
		System.out.println("La tabla ordenada de menor a mayor queda así: ");
		
		//Recorre la tabla y muestra los carácteres una vez están ya ordenados.
		for (i=0; i<MAX; i++)
		{
			System.out.println(tabla[i]);
		}

	}

}


/*
for (i=0; i<MAX; i++)
		{
			j = i;
			aux = tabla[i];
			
			while ((j>0)&&(aux<tabla[j-1]))
			{
				tabla[j] = tabla[j-1];
				j = j-1;
			}
			
			tabla[j] = aux;
		}
		
		System.out.println("La tabla ordenada queda así: ");
		
		for (i=0; i<MAX; i++)
		{
			System.out.println(tabla[i]);
		}
*/