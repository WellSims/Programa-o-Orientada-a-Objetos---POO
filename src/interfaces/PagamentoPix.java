package interfaces;

public class PagamentoPix implements Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento com Pix processado.");
    }

}