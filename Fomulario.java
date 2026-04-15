package maria.maria;

import java.util.Scanner;

public class Fomulario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite outro numero: ");
		int num2 = sc.nextInt();
		
		int soma = num1 + num2; 
			System.out.println("A soma dos numeros inseridos e: "+soma);
		int resto = soma % 2;
			if (resto == 0) {
				System.out.println("a soma eh par");
			}else {
				System.out.println("a soma eh impar");
			}
	}}
