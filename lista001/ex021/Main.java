package ex021;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numeroDeNotas = 3;
        float notas[] = new float[numeroDeNotas];

        lerNotas(numeroDeNotas, notas);
        float media = calcularMedia(numeroDeNotas, notas);
        imprimirResultado(media);
    }

    private static void lerNotas(int numeroDeNotas, float[] notas) {
        Scanner scanner = new Scanner(System.in);
        for (int indice = 0; indice < numeroDeNotas; indice++) {
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
    }

    private static float calcularMedia(int numeroDeNotas, float[] notas) {
        float somaNotas = 0;
        for (int indice = 0; indice < numeroDeNotas; indice++) {
            somaNotas += notas[indice];
        }
        return somaNotas / numeroDeNotas;
    }

    private static void imprimirResultado(float media) {
        System.out.println("A média das notas do aluno é: " + media);
        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }

    private static void consumirInputInvalido(Scanner scanner) {
        if (scanner.hasNext()) {
            scanner.next(); // consumir valor atualmente no input se for inválido
        }
    }
}
