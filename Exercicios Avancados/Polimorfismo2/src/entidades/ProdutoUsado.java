package entidades;

public class ProdutoUsado extends Produtos{
    protected String data;

    public ProdutoUsado(String nome, Double valor, String data) {
        super(nome, valor);
        this.data = data;
    }

    @Override
     public Double ticket(){
        return super.ticket();
    }

     public String ticketFinal(){
        return "Produto: " + getNome() + " Ticket: " + data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
     
    
}
