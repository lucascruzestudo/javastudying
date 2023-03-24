//classe Calculator
public class Calculator {
    // variáveis privadas num1 e num2 para cálculo
    private float num1;
    private float num2;
    
    // construtor da classe
    public Calculator(float num1, float num2) {
        // atribuição dos valores dos parâmetros às variáveis da classe
        this.num1 = num1;
        this.num2 = num2;
    }

    // alterar o valor da variável num1
    public void setNum1(float num1) {
        this.num1 = num1;
    }

    // alterar o valor da variável num2
    public void setNum2(Float num2) {
        this.num2 = num2;
    }

    // funcao soma
    public float add(){
        return num1+num2;
    }

    // funcao subtracao
    public float subtract(){
        return num1-num2;
    }

    // funcao multiplicacao
    public float multiply(){
        return num1*num2;
    }

    // funcao divisao
    public float divide(){
        return num1/num2;
    }

    }