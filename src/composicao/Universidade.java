package composicao;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
    private List<Curso> cursos;

    public Universidade(){
        this.cursos = new ArrayList<Curso>();
    }

    public Universidade(String pNome){
        this();
        this.nome = pNome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursos() {
        return this.cursos;
    }
    
    public void adicionarCurso(String pNomeCurso){
        this.cursos.add(new Curso(pNomeCurso));
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cursos='" + getCursos().toString() + "'" +
            "}";
    }

}
