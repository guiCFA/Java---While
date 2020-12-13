import java.util.Scanner;

public class ex9 {

	public static void main (String [] args) {
		Scanner teclado = new Scanner (System.in);
		
		int alunos= 0;
		double nota1, nota2, notaGeral = 0;

		do {
			System.out.println("Digite as notas do " + (alunos + 1) + "° aluno");
			System.out.println("Digite a primeira nota");
			nota1 = teclado.nextInt();
			
			System.out.println("Digite a segunda nota");
			nota2 = teclado.nextInt();
			
			if(nota1 < 0 || nota1 > 10) {
				System.out.println("Nota invalida!!! digite uma nota entre 0 e 10 ");
			}
			
			if(nota2 < 0 || nota2 > 10) {
				System.out.println("Nota invalida!!! digite uma nota entre 0 e 10 ");
			}
			
			
			System.out.println("sua média é " + ((nota1 + nota2) / 2) );
			
			notaGeral = notaGeral + nota1 + nota2;		
			alunos++;
			
			
		}while(alunos < 5);
		
		notaGeral = notaGeral / alunos;	
		
		System.out.println("A media da sala é " + notaGeral);
		
	}
}
