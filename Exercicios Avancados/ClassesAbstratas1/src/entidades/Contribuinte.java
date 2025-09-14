package entidades;

public abstract class Contribuinte {
    public String nome;
    public double rendaanual;
    
    public Contribuinte(String nome, double rendaanual) {
        this.nome = nome;
        this.rendaanual = rendaanual;
    }

    public abstract Double taxa();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaanual() {
        return rendaanual;
    }

    public void setRendaanual(double rendaanual) {
        this.rendaanual = rendaanual;
    }

    

    
}
