package aula1;

import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		String nomeVendedor;
		double salarioFixo;
		double vendas;
		double comissao;
		double salarioFinal;
		
		System.out.print("Digite o nome do vendedor:");
		nomeVendedor=input.nextLine();
		
		System.out.print("Digite o salário fixo:");
		salarioFixo=input.nextDouble();
		
		System.out.print("Digite o total de vendas:");
		vendas=input.nextDouble();
		
		comissao=(vendas*15)/100;
		salarioFinal=comissao+salarioFixo;
		
		System.out.println("Nome do Vendeddor:" + nomeVendedor);
		System.out.println("Salario Fixo:" + salarioFixo+"reais");
		System.out.println("Salario Final:" + salarioFinal+"reais");
		
		
	}

}
