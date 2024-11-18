package agregacao;

public class Aluno {
    private String nome;

    public Aluno(String pNome){
        this.nome = pNome;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            "}";
    }

}


