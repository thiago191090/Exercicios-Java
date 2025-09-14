package classes;

public class Cliente {
    public String nome;
    public int idade;
    public String telefone;
    
    
    public Cliente(String nome, int idade, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    @Override
    public String toString() {
        return "Nome Cliente: " + nome + 
        "\nIdade: " + idade + 
        "\nTelefone: " + telefone;
    }

    


    
}

