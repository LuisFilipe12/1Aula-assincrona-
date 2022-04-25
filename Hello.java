package aulas;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

		System.out.println("Hello World");

		double num1;
		System.out.print("Informe um numero: ");
		num1 = leia.nextDouble();
		System.out.println("O numero selecionado foi: " + num1);

		double numb1;
		double numb2;
		double soma;
		System.out.print("Me informe um numero: ");
		numb1 = leia.nextDouble();
		System.out.print("Me informe mais um numero: ");
		numb2 = leia.nextDouble();

		soma = (numb1 + numb2);
		System.out.println("A soma dos dois numeros e: " + soma);

		double base;
		double altura;
		double multiplique;

		System.out.println("Vamos calcular a area de um quadrado");
		System.out
				.println("Antes de começar, lembre-se que ao calcular a area do quadrado, que ele possui lados iguais");

		System.out.print("Me informe a base: ");
		base = leia.nextDouble();
		System.out.print("Me informe a altura: ");
		altura = leia.nextDouble();

		multiplique = (base * altura);
		System.out.println("A area do quadrado e: " + multiplique + "quadrado");

		double number1;
		double number2;
		double dias;

		System.out.print("Quantas horas você trabalhadas por mês: ");
		number1 = leia.nextDouble();

		System.out.print("Quanto ganha por hora ?: ");
		number2 = leia.nextDouble();

		dias = (number1 * number2);

		System.out.println("Voce ganha: " + dias + "por mes");

		double numbr1;
		double numbr2;
		double fahrenheit;
		double celsius;

		System.out.print("Me informe a temperatura em Fahrenheit: ");
		fahrenheit = leia.nextDouble();

		numbr1 = 5 * ((fahrenheit - 32) / 9);

		System.out.println("A temperatura em celsius e" + numbr1);

		System.out.println("Me informe a temperatura em celsius: ");
		numbr2 = leia.nextDouble();

		celsius = (numbr2 * 9 / 5) + 32;

		System.out.println("A temperatura em Fahrnheit e" + celsius);

		leia.close();

	}

}
