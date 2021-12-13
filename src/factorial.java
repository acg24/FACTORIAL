
public class factorial {

	public static void main(String[] args) {
		System.out.println( "Ejemplo del Cálculo del factorial de un número en Java:" );
		System.out.println("-Escribe un numero del cual quieras saber el factorial:");
		int num = Console.readInt();
	      System.out.println( "El factorial de " + num + " es: " + factorial( num ) );    

	}
	public static int factorial( int numero ) {
	      int fact = 1;
	      for( int i = 1; i <= numero; i++ ) {
	         fact *= i;
	      }
	 
	      return fact;
	 
	}

}
