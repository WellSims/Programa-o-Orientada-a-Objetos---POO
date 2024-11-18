package associacao;

public class Disciplina {
    private String nome;
    private Professor professor;

    public Disciplina(String pNome){
        this.nome = pNome;
    }

    public Disciplina(Professor pProfessor){
        this.professor = pProfessor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return String.format("""
                nome=%s,
                professor=%s
                """, this.nome, professor.toString());
    }
}
