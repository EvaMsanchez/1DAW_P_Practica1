package es.studium.ejercicios;

import java.util.Random;

public class Aleatorio
{

	public static void main(String[] args)
	{
		int a, b, vueltas=0;
		
		Random random = new Random(); //Crear el objeto random (para crear n�meros aleatorios).
		
		do
		{
			a = random.nextInt(10); //Busca un numero entre los 10 primeros n�meros.
			b = random.nextInt(20);
			
			vueltas = vueltas+1; //N�mero de vueltas.
		}
		while (a!=b);
		
		System.out.println(vueltas);
	
	}

}


/*Pseudoc�digo
 
PROGRAMA Ejercicio1
VARIABLES
ENTERO a, b, v = 0
INICIO 
HACER
a = ALEATORIO(10)
b = ALEATORIO(20)
v = v + 1
MIENTRAS a != b
ESCRIBIR v
FIN 

*/

