/***************************************************************
					Universidad de Colima
				   Facultad de Telemática
				  Ingeniería en Telemática
				 José Noé Vázquez Gutiérrez

Algortimo MaxMin

	Este programa recibe N parametros como argumentos por la linea
de comandos.
Los argumentos deben estar ordenados de menor a mayor, a excep_
cción del último, que indica el tamaño del enlace.

Compilar:
	javac maxmin.java

Ejecutar:
	java maxmin 2 2 4 6 20
	-> 2.0
	-> 2.0
	-> 4.0
	-> 12.0

ENGLISH:

MaxMin Algorithm

	This program receives N parameters as arguments via
command line.
Arguments must be sorted from least to greatest, except the
last, which indicates the size of the link.

Compile:
	javac maxmin.java

Execute:
	java maxmin 2 2 4 6 20
	-> 2.0
	-> 2.0
	-> 4.0
	-> 12.0
***************************************************************/
public class maxmin{
	public static void main(String [] args){
		float enlace_bd = Integer.parseInt( args[args.length-1]);
		float sobrante = 0;
		float [] arr = new float [args.length-1];
		int enlaces_cantidad = args.length-1;
		for ( int i = 0 ; i < enlaces_cantidad ; i++ ) {
			arr[i] += enlace_bd / enlaces_cantidad;
			if ( i == enlaces_cantidad-1 )
				break;
			if ( Float.parseFloat(args[i])<arr[i] ) {
				sobrante = arr[i] - Float.parseFloat( args[i] );
				arr[i] = Float.parseFloat( args[i] );
				for ( int a=i+1 ; a<enlaces_cantidad ; a++ ) {
					arr[a] += sobrante / ( enlaces_cantidad-(i+1) );
				}
			}
		}
		for (int i=0; i<enlaces_cantidad; i++)
			System.out.println("-> "+arr[i]);
	}
}