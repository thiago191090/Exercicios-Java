public class Calculo {
    public double num1;
    public double num2;
    
    
    public Calculo(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double adicao(double num1, double num2){
        return num1 + num2;
    }
    public double subtracao(double num1, double num2){
        return num1 - num2;
    }
    public double multiplicacao(double num1, double num2){
        return num1 * num2;
    }
    public double divisao(double num1, double num2){
        return num1 / num2;
    }
    
}
