package es.studium.ejercicios;

import java.util.Random;

public class Aleatorio
{

	public static void main(String[] args)
	{
		int a, b, vueltas=0;
		
		Random random = new Random(); //Crear el objeto random (para crear números aleatorios).
		
		do
		{
			a = random.nextInt(10); //Busca un numero entre los 10 primeros números.
			b = random.nextInt(20);
			
			vueltas = vueltas+1; //Número de vueltas.
		}
		while (a!=b);
		
		System.out.println(vueltas);
	
	}

}


/*Pseudocódigo
 
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

