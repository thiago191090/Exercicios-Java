package entidades;

public class PessoaJuridica extends Contribuinte{
    public Double nunfunc;

    public PessoaJuridica(String nome, double rendaanual, Double nunfunc) {
        super(nome, rendaanual);
        this.nunfunc = nunfunc;
    }

    @Override
    public Double taxa(){
        if (nunfunc > 10) {
            return (getRendaanual() * 0.14);
        } else {
            return (getRendaanual() * 0.16);
        }
    }
    public Double getNunfunc() {
        return nunfunc;
    }

    public void setNunfunc(Double nunfunc) {
        this.nunfunc = nunfunc;
    }

    
}
