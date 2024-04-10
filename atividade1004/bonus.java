package atividade1004;

import java.util.Scanner;

public class bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int sal;
		
		 System.out.print("Informe os anos de contribuição na empresa:");
	        sal = ler.nextInt();
		String mensagem = sal <= 3 ? "Você vai receber 5% de bônus" : "Você vai receber 7% de bônus";
		System.out.println(mensagem);
		
		
	}

}
