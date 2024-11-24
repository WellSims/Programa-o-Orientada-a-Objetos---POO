package interfaces;

public class PagamentoCartao implements Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento com Cartão processado.");
    }

}
