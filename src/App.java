import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import abstracao.Circulo;
import abstracao.Retangulo;
import agregacao.Aluno;
import agregacao.Curso;
import associacao.Disciplina;
import associacao.Professor;
import classes.Carro;
import composicao.Universidade;
import designPatterns.factoryMethod.Logistica;
import designPatterns.factoryMethod.LogisticaMaritima;
import designPatterns.factoryMethod.Transporte;
import designPatterns.singleton.UniversidadeBusiness;
import designPatterns.strategy.CalculoStrategy;
import designPatterns.strategy.SomaStrategy;
import encapsulamento.ContaBancaria;
import herancaPolimorfismo.Animal;
import herancaPolimorfismo.Cachorro;
import herancaPolimorfismo.Gato;
import interfaces.PagamentoCartao;
import interfaces.PagamentoPix;

public class App {

    private static Logistica logistica;
    private static CalculoStrategy strategy;
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
        System.out.println("------------------------------");
        System.out.println("ABSTRAÇÃO");
        testarAbstracao();
        System.out.println("------------------------------");
        System.out.println("INTERFACES");
        testarInterfaces();
        System.out.println("------------------------------");
        System.out.println("TESTAR DESIGN PATTERNS");
        testarDesignPatterns();
    }

    private static void testarDesignPatterns() {
        System.out.println("-----------DESIGN PATTERNS---------");
        System.out.println("-----------SINGLETON");
        Universidade lUniversidade = new Universidade("");
        lUniversidade.adicionarCurso("Engenharia do Pino da Parafuseta");
        lUniversidade.adicionarCurso("Analise e Desenvolvimento de Vagabundos");
        lUniversidade.adicionarCurso("Medequina");
        lUniversidade.adicionarCurso("Enfermago");
        UniversidadeBusiness.getInstancia().validar(lUniversidade);

        System.out.println("-----------FACTORY METHOD");
        logistica = new LogisticaMaritima();
        logistica.iniciarEntrega();

        System.out.println("-----------STRATEGY");
        if(strategy == null){
            strategy = new SomaStrategy();
            strategy.calcular(2, 3);
        }
    }

    private static void testarInterfaces() {
        PagamentoPix lPagamentoPix = new PagamentoPix();
        lPagamentoPix.processarPagamento();

        PagamentoCartao lPagamentoCartao = new PagamentoCartao();
        lPagamentoCartao.processarPagamento();
    }

    private static void testarAbstracao() {
        Circulo lCirculo = new Circulo();
        lCirculo.setRaio(4);
        lCirculo.calcularArea();
        lCirculo.calcularPerimetro();

        Retangulo lRetangulo = new Retangulo();
        lRetangulo.setAltura(2);
        lRetangulo.setBase(4);
        lRetangulo.calcularArea();
        lRetangulo.calcularPerimetro();
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
