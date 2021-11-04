package es.iessoterohernandez.daw.endes.fibonacciMain;

import java.util.Scanner;

import es.iessoterohernandez.daw.endes.fibonacci.Fibonacci;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para la sucesión de Fibonacci:");
		System.out.println(Fibonacci.fib(sc.nextInt()));
	}
}
