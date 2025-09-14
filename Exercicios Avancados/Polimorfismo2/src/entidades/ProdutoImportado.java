package entidades;

public class ProdutoImportado extends Produtos{
    private Double imposto;

    public ProdutoImportado(String nome, Double valor, Double imposto) {
        super(nome, valor);
        this.imposto = imposto;
    }

    
    
    @Override
     public Double ticket(){
        return super.ticket() + imposto;
    }

    @Override
     public String ticketFinal(){
        return "Produto: " + getNome() + " Ticket: " + ticket();
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

}
