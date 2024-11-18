package agregacao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Aluno> alunos;

    public Curso(){
        this.alunos = new ArrayList<Aluno>();
    }

    public Curso(String pNome){
        this();
        this.nome = pNome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return this.alunos;
    }

    public void adicionarAluno(Aluno pAluno){
        alunos.add(pAluno);
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", alunos='" + getAlunos().toString() + "'" +
            "}";
    }
    
}
