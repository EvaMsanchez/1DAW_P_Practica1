package es.studium.ejercicios;

public class SumaParesImpares
{

	public static void main(String[] args)
	{
		final int FILAS = 3; //Longitud que son los huecos.
		final int COLUMNAS = 3;
		
		int suma;  //Sumar las posiciones.
		int pares=0;
		int impares=0;
		
		int matriz [] []= new int [3] [3]; //Matriz: primer número indica las filas,
										  // y el segundo número las columnas.
		
		for (int i=0; i<FILAS; i++)
		{
		
			for (int j=0; j<COLUMNAS; j++)  //Se mete aquí y recorre el bucle entero, luego vuelve arriba.
			{
				System.out.println(i+" "+j + " suma = " + (suma = i+j));
				
				if(suma%2==0)
				{
					pares = pares + suma;
				}
				else
					impares = impares + suma;
			}
			
		}
		
		System.out.println("La suma de las posiciones pares es: "+ pares);
		System.out.println("La suma de las posiciones pares es: "+ impares);
		System.out.println("La diferencia entre las sumas es: "+diferencia(pares, impares));
	}
	
	
	//Función para hacer la diferencia entre las sumas de pares e impares.
	public static int diferencia (int p, int imp)
	{
		return (p-imp);
	}

}
