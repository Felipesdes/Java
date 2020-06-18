package aula1;

import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		double TaxadeConsumo;
		double km1;
		double km2;
		double kmtotal;
		double litros;
		
		System.out.print("Informe o Km Inicial:");
		km1=input.nextDouble();
		
		System.out.print("Informe a qtde de litros:");
		litros=input.nextDouble();
		
		System.out.print("Informe o Km Final:");
		km2=input.nextDouble();
		
		kmtotal=km2-km1;
		
		TaxadeConsumo=kmtotal/litros;
		
		System.out.println("O total percorrido foi" + kmtotal+ "km" );
		System.out.println("A taxa media de consumo é" + litros );
		
		
		
		
		
	}

}
