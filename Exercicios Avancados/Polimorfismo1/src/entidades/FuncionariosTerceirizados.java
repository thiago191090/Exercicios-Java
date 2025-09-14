package entidades;

public class FuncionariosTerceirizados extends Funcionarios {
    private Double adicional;

    public FuncionariosTerceirizados(String nome, Integer horas, Double valorhoras, Double adicional) {
        super(nome, horas, valorhoras);
        this.adicional = adicional;
    }

    public Double getAdicional() {
        return adicional;
    }

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }
    
    @Override
     public Double pagamento(){
        return super.pagamento() + (adicional * 1.1);
    }
}
