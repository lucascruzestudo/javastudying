public class Calculator {
    private float num1;
    private float num2;

    public Calculator() {
        // Do nothing in the constructor
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public void setNum2(Float num2) {
        this.num2 = num2;
    }

    public float add(){
        return num1 + num2;
    }

    public float subtract(){
        return num1 - num2;
    }

    public float multiply(){
        return num1 * num2;
    }

    public float divide(){
        return num1 / num2;
    }
}
