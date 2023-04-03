package ex005;

/*
5 – Faça um algoritmo que calcule a soma dos primeiros 50 números pares. Este algoritmo não recebe
valor do teclado. Os primeiros número pares são: 2, 4, 6, ...
 */

public class Main {
    public static void main(String[] args){
        // variável pra guardar a soma
        int soma = 0;
        for (int numero=0;numero<=50;numero++){
            if (numero%2==0) {
                // incrementar a variável soma com o numero atual se o mesmo for par (resultado da divisão por 2 for 0)
                soma+=numero;
            }
        }
        // printar o valor da variável soma após termino dos incrementos
        System.out.println("Soma dos números pares de 0 a 50: "+soma);
    }
}