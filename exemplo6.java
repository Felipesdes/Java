package aula1;

import java.util.Scanner;

public class exemplo6 {

	public static void main(String[] args) {
				
		int idade;
		String nome,sobrenome;
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome");
		
		nome = ler.next();
		System.out.println("Digite seu Sobrenome");
		sobrenome = ler.next();
		
		System.out.println("Digite sua idade");
		idade = ler.nextInt();
		
		System.out.print("Seu Primeiro nome é = " + nome + "Sua Idade é = " + idade);
	
	}

}