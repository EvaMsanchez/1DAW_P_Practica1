package es.studium.ejercicios;

public class Selvas
{

	public static void main(String[] args)
	{
		String selvas [] = {"Congo", "Borneo", "Madagascar", "Amazonas"}; //Declarar tabla tipo cadena con valores.
		int extensiones [] = {700000, 743330, 199500, 7000000};	//Tabla de n�meros enteros.
		int minimo;
		int posicion=0;
		
		//M�nimo.
		minimo = extensiones [0]; //Aqu� decido yo cual es el m�nimo para as� poder comparar. 
								 //	En este caso el que est� en posici�n 0.
		
		for (int i=0; i<extensiones.length; i++) //Recorrer la tabla.
		{
			if (extensiones[i]<minimo) //Menor que el valor que est� en la posici�n 0 se�alada antes.
			{
				minimo = extensiones[i];
				
				posicion = i;
			}
		}
	
		System.out.println("La selva con menor extensi�n es "+(selvas[posicion])+" con "+(minimo));
			
	}

}


