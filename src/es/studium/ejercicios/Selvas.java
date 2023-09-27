package es.studium.ejercicios;

public class Selvas
{

	public static void main(String[] args)
	{
		String selvas [] = {"Congo", "Borneo", "Madagascar", "Amazonas"}; //Declarar tabla tipo cadena con valores.
		int extensiones [] = {700000, 743330, 199500, 7000000};	//Tabla de números enteros.
		int minimo;
		int posicion=0;
		
		//Mínimo.
		minimo = extensiones [0]; //Aquí decido yo cual es el mínimo para así poder comparar. 
								 //	En este caso el que está en posición 0.
		
		for (int i=0; i<extensiones.length; i++) //Recorrer la tabla.
		{
			if (extensiones[i]<minimo) //Menor que el valor que esté en la posición 0 señalada antes.
			{
				minimo = extensiones[i];
				
				posicion = i;
			}
		}
	
		System.out.println("La selva con menor extensión es "+(selvas[posicion])+" con "+(minimo));
			
	}

}


