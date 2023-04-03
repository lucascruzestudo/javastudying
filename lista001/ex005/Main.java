package ex005;

/*
5 – Faça um algoritmo que calcule a soma dos primeiros 50 números pares. Este algoritmo não recebe
valor do teclado. Os primeiros número pares são: 2, 4, 6, ...
*/

public class Main {
    public static void main(String[] args) {
        int soma = obterSomaDePares();
        imprimirResultado(soma);
    }

    private static int obterSomaDePares(){
        int soma = 0;
        for (int numero = 0; numero <= 50; numero++) {
            if (numero % 2 == 0) {
                soma += numero;
            }
        }
        return soma;
    }

    private static void imprimirResultado(int resultado) {
        System.out.println("A soma dos primeiros 50 números pares é: " + resultado);
    }
}
