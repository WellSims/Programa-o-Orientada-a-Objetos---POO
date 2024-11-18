import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import agregacao.Aluno;
import agregacao.Curso;
import associacao.Disciplina;
import associacao.Professor;
import classes.Carro;
import composicao.Universidade;
import encapsulamento.ContaBancaria;
import herança_polimorfismo.Animal;
import herança_polimorfismo.Cachorro;
import herança_polimorfismo.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("CLASSES E MÉTODOS");
        testarClasses();
        System.out.println("------------------------------");
        System.out.println("ENCAPSULAMENTO");
        testarEncapsulamento();
        System.out.println("------------------------------");
        System.out.println("HERANÇA");
        testarHerança();
        System.out.println("------------------------------");
        System.out.println("POLIMORFISMO");
        testarPolimorfismo();
        System.out.println("------------------------------");
        System.out.println("ASSOCIAÇÃO");
        testarAssociacao();
        System.out.println("------------------------------");
        System.out.println("AGREGAÇÃO");
        testarAgregagacao();
        System.out.println("------------------------------");
        System.out.println("COMPOSIÇÃO");
        testarComposicao();
    }

    private static void testarComposicao() {
        Universidade lUniversidade = new Universidade("Universidade Federal da Ordem, Decência e Amizade - UFODA");
        lUniversidade.adicionarCurso("Engenharia do Pino da Parafuseta");
        lUniversidade.adicionarCurso("Analise e Desenvolvimento de Vagabundos");
        lUniversidade.adicionarCurso("Medequina");
        lUniversidade.adicionarCurso("Enfermago");
        System.out.println(lUniversidade.toString());        
    }

    private static void testarAgregagacao() {
        Aluno lAluno1 = new Aluno("MC Gorila");
        Aluno lAluno2 = new Aluno("Mc Duda da Chatuba");

        Curso lCurso = new Curso("Chatuba de Mesquita");
        lCurso.adicionarAluno(lAluno1);
        lCurso.adicionarAluno(lAluno2);

        System.out.println(lCurso.toString());
    }

    private static void testarAssociacao() {
        Professor lProfessor = new Professor("DJ Rogerin", "Especialista em putologia");
        Disciplina lDisciplina = new Disciplina("Putologia e suas tecnologias");
        lDisciplina.setProfessor(lProfessor);

        System.out.println(lDisciplina.toString());
    }

    private static void testarPolimorfismo() {
        List<Animal> lAnimais = new ArrayList<Animal>();

        lAnimais.add(new Cachorro());
        lAnimais.add(new Gato());

        for (Animal lAnimal : lAnimais) {
            lAnimal.emitirSom();
        }
    }

    private static void testarHerança() {
        Cachorro lCachorro = new Cachorro();
        lCachorro.emitirSom();

        Gato lGato = new Gato();
        lGato.emitirSom();
    }

    public static void testarClasses() {
        Carro lCarro = new Carro("Citroen", "C4");
        lCarro.acelerar();
        lCarro.acelerar();
        lCarro.acelerar();
        lCarro.acelerar();
        lCarro.exibirInformacoes();
        lCarro.frear();
        lCarro.frear();
        lCarro.frear();
        lCarro.exibirInformacoes();
    }

    public static void testarEncapsulamento() {
        ContaBancaria lContaBancaria = new ContaBancaria("DJ Rogerinho");
        lContaBancaria.sacar(new BigDecimal(200));
        lContaBancaria.depositar(new BigDecimal(500));
        lContaBancaria.sacar(new BigDecimal(1000));
        System.out.println("SALDO: " + lContaBancaria.getSaldo());
    }
}
