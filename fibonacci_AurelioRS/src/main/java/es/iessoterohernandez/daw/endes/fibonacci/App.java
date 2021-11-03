package es.iessoterohernandez.daw.endes.fibonacci;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	// TODO Auto-generated method stub
    			Scanner sc = new Scanner(System.in);
    			System.out.println("Introduce un número para la sucesión:");
    			System.out.println(Fibonacci.fib(sc.nextInt()));
    }	
}
