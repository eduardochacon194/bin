package dab;

import java.util.Scanner;
// Luis Orozco -- Eduardo Chacon
public class App {
	static int n=0;
	static Scanner leer= new Scanner(System.in);
	
	

	public static void main(String[] args) {
		System.out.println("Introduzca numero: ");
	    n = leer.nextInt();
	    System.out.println();
	    System.out.print("Binario: ");
        DaB(n);	  
        System.out.println();
	}
	public static void DaB(int n)
	{
		if(n<2)
		{
			System.out.print(n);
			return;
		}else
		{
			DaB(n/2);
			System.out.print(n%2);
			
		}
	}

}
