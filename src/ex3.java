import java.util.Scanner;

public class ex3 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		int contador = 0,numero,resultado,contadorPar = 0,contadorImpar = 0;
	
		while(contador < 5) {
			
			System.out.println("Digite o " + (contador + 1) + "° numero");
			numero = teclado.nextInt();
			
			resultado = numero % 2;
			if(resultado == 0) {
				contadorPar = contadorPar + 1;
			} else {
				contadorImpar++;
			}
			
			contador++;		
			
			System.out.println("pares: " + contadorPar);
			System.out.println("impares: " + contadorImpar);
		}
		
	}
}
