package associacao;

public class Professor {
    private String nome;
    private String especialidade;

    public Professor(String pNome, String pEspecialidade){
        this.nome = pNome;
        this.especialidade = pEspecialidade;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return String.format("""
                nome=%s,
                especialidade=%s
                """, this.nome, this.especialidade);
    }
}
