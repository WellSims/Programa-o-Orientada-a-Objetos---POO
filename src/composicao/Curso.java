package composicao;

import utils.ModelBase;

public class Curso extends ModelBase {

    private String nome;

    public Curso(String pNome){
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
