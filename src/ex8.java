import java.util.Scanner;

public class ex8 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		char resposta = 's';
		double valor;
		
		
		while(resposta == 's') {
			
			System.out.println("Qual o senhor(a) vai querer?");
			int quantidade, produto = teclado.nextInt();
			
			switch(produto) {
			case 100:
				System.out.println("Você escolheu um Cachorro Quente no valor de 1,20!");
				System.out.println("Quantos o senhor(a) vai querer?");
				quantidade = teclado.nextInt();
				valor = 1.20;
				System.out.println("Senhor(a), deu um total de " + (quantidade * valor));
				break;
			case 101:
				System.out.println("Você escolheu um Bauru Simples no valor de 1,30!");
				System.out.println("Quantos o senhor(a) vai querer?");
				quantidade = teclado.nextInt();
				valor = 1.30;
				System.out.println("Senhor(a), deu um total de " + (quantidade * valor));
				break;
			case 102:
				System.out.println("Você escolheu um Bauru com Ovo  no valor de 1,50!");
				System.out.println("Quantos o senhor(a) vai querer?");
				quantidade = teclado.nextInt();
				valor = 1.50;
				System.out.println("Senhor(a), deu um total de " + (quantidade * valor));
				break;
			case 103:
				System.out.println("Você escolheu um Hambúrguer no valor de 1,20!");
				System.out.println("Quantos o senhor(a) vai querer?");
				quantidade = teclado.nextInt();
				valor = 1.20;
				System.out.println("Senhor(a), deu um total de " + (quantidade * valor));
				break;
			case 104:
				System.out.println("Você escolheu um Cheeseburguer no valor de 1,30!");
				System.out.println("Quantos o senhor(a) vai querer?");
				quantidade = teclado.nextInt();
				valor = 1.30;
				System.out.println("Senhor(a), deu um total de " + (quantidade * valor));
				break;
			case 105:
				System.out.println("Você escolheu um Refrigerante no valor de 1,00!");
				System.out.println("Quantos o senhor(a) vai querer?");
				quantidade = teclado.nextInt();
				valor = 1.00;
				System.out.println("Senhor(a), deu um total de " + (quantidade * valor));
				break;
			default:
				System.out.println("Acredito que não temos esse produto..");
			}
				
			
			System.out.println("gostaria de mais alguma coisa?");
			resposta = teclado.nextLine().charAt(0);
			
		}
		
		System.out.println("Muito obrigado :D");
	}
}
