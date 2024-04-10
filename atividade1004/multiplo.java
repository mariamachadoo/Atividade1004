package atividade1004;

import java.util.Scanner;

public class multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		double a;
		System.out.print("Informe um valor:");
		a = ler.nextDouble();
		
		String mensagem = a % 5 == 0 ? "O número " +a + " É múltiplo de 5" : "O número:" + a + " Não é múltiplo de 5";
		System.out.println(mensagem);
	}
}
