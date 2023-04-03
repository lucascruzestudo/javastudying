package ex021;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 21 – Fazer um algoritmo que leia três notas e mostre: a média das notas, a situação final do aluno
onde aprovado media = 7.
 */

public class Main {
	public static void main(String[] args) {
		int numeroDeNotas = 3;
		float notas[] = new float[numeroDeNotas];

		Scanner scanner = new Scanner(System.in);

		for (int indice = 0; indice <= 2; indice++) {
			boolean valorValido = false;
			String mensagemErro = "O valor informado nao é valido, informe um valor numérico maior que 0 e menor ou igual a 10.";

			do {
				try {
					System.out.println("Informe o " + (indice + 1) + "º valor:");
					notas[indice] = scanner.nextFloat();

					if (notas[indice] >= 0 && notas[indice] <= 10) {
						valorValido = true;
					} else {
						System.out.println(mensagemErro);
					}

				} catch (InputMismatchException e) {
					System.out.println(mensagemErro);
					consumirInputInvalido(scanner);
				}

			} while (!valorValido);

		}

		scanner.close();

		float somaNotas = 0;

		for (int indice = 0; indice <= 2; indice++) {
			somaNotas += notas[indice];
		}

		float resultado = somaNotas / numeroDeNotas;

		System.out.println("A média das notas do aluno é: " + resultado);

	}

	private static void consumirInputInvalido(Scanner scanner) {
		if (scanner.hasNext()) {
			scanner.next(); // consumir valor atualmente no input se for inválido
		}
	}

}
