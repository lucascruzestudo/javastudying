package ex016;

/*
 * 16 – Maria quer saber quantos litros de gasolina precisa colocar em seu carro e quanto vai gastar para
fazer uma viagem até a casa de sua irmã. Dados extras: Distância da casa de Maria até sua irmã :520
km Seu carro consome um litro a cada 12 Km rodado. Ela abastece sempre no mesmo posto, onde o
preço da gasolina é R$ 1,50 o litro. 
 */

public class Main {
    public static void main(String[] args) {
        float distancia = 520;// km
        float consumo = 12;// km
        float precoGasolina = 1.5f;
        float litrosNecessarios = distancia / consumo;
        float custoTotal = litrosNecessarios * precoGasolina;
        System.out.println("Maria precisará de " + litrosNecessarios
                + " litros para chegar ao destino, o custo será: R$" + custoTotal);
    }
}
