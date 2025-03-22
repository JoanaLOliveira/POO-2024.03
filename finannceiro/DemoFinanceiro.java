public class DemoFinanceiro {

    public static void main(String[] args) {
        Assalariado func = new Assalariado("Luiz", "09133", 2345.98F);
        Fatura fatura = new Fatura(123.45F, 5);
    }

    public static void imprimeCustoPagamento(Pagavel pagavel){
        System.out.println("Valor do Pagamento; "+pagavel.obterValorPagamento());
    }
}