//libreria para solicitud de datos a usuario
import java.util.Scanner;
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadoraPrubea;
		Scanner usuario = new Scanner(System.in);
		String direccion;
		direccion="";

		
		try
		{
			System.out.println("Ingrese el nombre del archivo que contiene la operacion (incluir el .txt) ");
			direccion= usuario.nextLine();
			
			System.out.println("Ingrese como Desea que funcione el programa:\n 1.Vector\n 2.ArrayList\n 3.ListasEnlazadas ");
			int tipo1=usuario.nextInt();


			if(tipo1==3){
				System.out.println("Que Lista desea usar?:\n 1.Sigle Linked List\n 2.Double LinkedList\n 3.Circular Linked List");
				int tipo2=usuario.nextInt();
				calculadoraPrubea = new Calculadora(tipo1,tipo2);
			}
			else
				calculadoraPrubea = new Calculadora(tipo1,35);
			
		
			String instrucciones = calculadoraPrubea.leerArchivo(direccion);
			System.out.println(instrucciones);
			int resultado = calculadoraPrubea.calcular(instrucciones);
			System.out.println("El resultado de la operacion es : "+resultado);
		}
		catch(Exception e)
		{
			System.out.println("no se encontro o no existe el archivo solicitado");
		}
	}
}
