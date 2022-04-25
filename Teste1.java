package aulas;

import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double media; 
		double bimestre1;
		double bimestre2;
		double bimestre3;
		double bimestre4;
		System.out.print("Entre com a primeira nota do aluno: ");
		bimestre1 = leia.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		bimestre2 = leia.nextDouble();
		System.out.println("Entre com a terceira nota: ");
		bimestre3 = leia.nextDouble();
		System.out.println("Entre com a quarta nota: ");
		bimestre4 = leia.nextDouble();
		media = (bimestre1 + bimestre2 + bimestre3 + bimestre4) /4;
		
		System.out.println("A media do aluno foi: " + media);
		
		
		
		
				
				leia.close();
		
	}

}
