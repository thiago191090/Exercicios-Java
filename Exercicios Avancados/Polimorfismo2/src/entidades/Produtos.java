package entidades;

public class Produtos {
    private String nome;
    private Double valor;
    
    public Produtos(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Double ticket(){
        return valor;
    }

    public String ticketFinal(){
        return "Produto: " + getNome() + " Ticket: " + ticket();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    

    
}
