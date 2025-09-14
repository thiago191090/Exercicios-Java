package entidades;

public class PessoaFisica extends Contribuinte {
    public Double gastosaude;

    public PessoaFisica(String nome, double rendaanual, Double gastosaude) {
        super(nome, rendaanual);
        this.gastosaude = gastosaude;
    }

    @Override
    public Double taxa() {
        if (getRendaanual() < 20000) {
            return (getRendaanual() * 0.15) - (gastosaude * 0.5);
        } else {
            return (getRendaanual() * 0.25) - (gastosaude * 0.5);
        }
    }

    public Double getGastosaude() {
        return gastosaude;
    }

    public void setGastosaude(Double gastosaude) {
        this.gastosaude = gastosaude;
    }

}
