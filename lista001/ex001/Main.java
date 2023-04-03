package ex001;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] valoresPessoas = obterValoresPessoas();
        int contador90quilos = contarPessoasAcimaDe90Kg(valoresPessoas);
        float mediaIdades = calcularMediaIdades(valoresPessoas);
        imprimirResultado(contador90quilos, mediaIdades);
    }

    private static int[][] obterValoresPessoas() {
        int[][] valoresPessoas = new int[7][2];
        Scanner scanner = new Scanner(System.in);
        for (int pessoa = 0; pessoa < 7; pessoa++) {
            for (int indice = 0; indice < 2; indice++) {
                boolean valorValido = false;
                String mensagemErro = "O valor informado nao é valido, informe um valor numérico acima de 0.";
                do {
                    switch (indice) {
                        case 0:
                            System.out.println("Informe a idade da pessoa " + (pessoa + 1) + ": ");
                            break;
                        case 1:
                            System.out.println("Informe o peso da pessoa " + (pessoa + 1) + " em quilos: ");
                            break;
                    }
                    try {
                        valoresPessoas[pessoa][indice] = scanner.nextInt();
                        if (valoresPessoas[pessoa][indice] > 0) {
                            valorValido = true;
                        } else {
                            System.out.println(mensagemErro);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println(mensagemErro);
                        valorValido = false;
                        consumirInputInvalido(scanner);
                    }
                } while (valorValido == false);
            }
        }
        scanner.close();
        return valoresPessoas;
    }

    private static void consumirInputInvalido(Scanner scanner) {
        if (scanner.hasNext()) {
            scanner.next(); // consumir valor atualmente no input
        }
    }

    private static int contarPessoasAcimaDe90Kg(int[][] valoresPessoas) {
        int contador90quilos = 0;
        for (int pessoa = 0; pessoa < 7; pessoa++) {
            if (valoresPessoas[pessoa][1] > 90) {
                contador90quilos++;
            }
        }
        return contador90quilos;
    }

    private static float calcularMediaIdades(int[][] valoresPessoas) {
        float totalIdades = 0;
        for (int pessoa = 0; pessoa < 7; pessoa++) {
            totalIdades += valoresPessoas[pessoa][0];
        }
        return totalIdades / 7;
    }

    private static void imprimirResultado(int contador90quilos, float mediaIdades) {
        System.out.println("Pessoas acima de 90 quilos: " + contador90quilos);
        System.out.println("Média das idades informadas: " + mediaIdades);
    }

}
