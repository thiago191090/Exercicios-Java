package Classes;

public class CalculadoraJava {
    public int num1;
    public int num2;

    public CalculadoraJava(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int Soma(int num1, int num2){
        return num1 + num2;
    }

    public int Subtracao(int num1, int num2){
        return num1 - num2;
    }

    public int Multiplicacao(int num1, int num2){
        return num1 * num2;
    }

    public int Divisao(int num1, int num2){
        return num1 / num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
