package es.studium.ejercicios;

import java.util.Scanner;

public class UnaUna
{

	public static void main(String[] args)
	{
		String cadena;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escribe una cadena: ");
		cadena = teclado.nextLine();
		teclado.close();
		
		for (int i=0; i<cadena.length(); i++)  //Recorrer la cadena.
		{
			System.out.println(cadena.charAt(i)); //Muestra carácter a carácter en vertical.
		}
		
	}

}


/*for (int i=cadena.length()-1; i>=0; i--) --> para que salga la cadena al revés.*/



/*for (int i = 0; i<nombreCompleto.length(); i+2) i=+2
{
	System.out.print(nombreCompleto.charAt(i));
	if(i<nombreCompleto.length()-1)
	{
		System.out.println(nombreCompleto.charAt(i+1));
	}
}*/