package es.iessoterohernandez.daw.endes.fibonacci;


public class Fibonacci {
	
	public static int fib(int n) {
		if (n<2) 
			return n;
		return fib(n-1)+fib(n-2);
		
//		if (n > 1) {
//			return fib(n - 1) + fib(n - 2);
//		} else if (n == 1) {
//			return 1;
//		} else if (n == 0) {
//			return 0;
//		} else {
//			System.out.println("El numero debe ser mayor que 0");
//			return -1;
//		}
	}
	
}
