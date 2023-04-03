package ex001;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 1 –Faça um algoritmo que receba a idade e o peso de 7 pessoas, calcule e mostre:
• A quantidade de pessoas com mais de 90 quilos;
• A média das idades das 7 pessoas. */


public class Main {

	public static void main(String[] args) {
		int[][] valoresPessoas = new int[7][2];
    /* 
    0 = idade 
    1 = peso
    */
		Scanner scanner = new Scanner(System.in);

		for (int pessoa = 0; pessoa < 7; pessoa++) {
			for (int indice = 0; indice < 2; indice++) {
				switch (indice) {
					case 0:
						System.out.println("Informe a idade da pessoa " + (pessoa + 1) + ": ");
						break;

					case 1:
						System.out.println("Informe o peso da pessoa " + (pessoa + 1) + " em quilos: ");
						break;
				}

				boolean valorValido = false;
        String mensagemErro = "O valor informado nao é valido, informe um valor numérico acima de 0.";
        
				do {
					try {
						valoresPessoas[pessoa][indice] = scanner.nextInt();

						if (valoresPessoas[pessoa][indice] > 0) {
							valorValido = true;
						} else {
							System.out.println(mensagemErro);
							valorValido = false;
							consumirInputInvalido(scanner);
						}

						break;
					} catch (InputMismatchException e) {
						System.out.println(mensagemErro);
						valorValido = false;
						consumirInputInvalido(scanner);
					}
				} while (valorValido == false);

			}

		scanner.close();
		
		}

		int contador90quilos = 0;
		float totalIdades = 0;

		for (int pessoa = 0; pessoa < 7; pessoa++) {

			totalIdades += valoresPessoas[pessoa][0];

			if (valoresPessoas[pessoa][1] > 90) {
				contador90quilos++;
			}
		}

		System.out.println("Pessoas acima de 90 quilos: " + contador90quilos);
		System.out.println("Média das idades informadas: " + (totalIdades / 7));

	}

	private static void consumirInputInvalido(Scanner scanner) {
		if (scanner.hasNext()) {
			scanner.next(); // consumir valor atualmente no input 
		}
	}

}