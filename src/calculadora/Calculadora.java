package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Primeiro valor");
			Integer valorA  = Integer.parseInt(in.nextLine());
			System.out.println("Operação");
			String operacao = in.nextLine();
			System.out.println("Segundo valor");
			Integer valorB  = Integer.parseInt(in.nextLine());
			if ("+".equalsIgnoreCase(operacao)) {
				System.out.println(adicao(valorA,valorB));
			}
		}catch(Exception e) {
			System.out.println("Digitou valor inválido");
		}
		
		in.close();
	}

	private static Integer adicao(Integer valorA, Integer valorB) {
		return valorA + valorB;
	}

}
