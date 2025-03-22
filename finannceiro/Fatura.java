public class Fatura implements Pagavel {
    private float precoItem;
    private int qtdItem;

    public Fatura(float precoItem, int qtdItem){
        this.precoItem=precoItem;
        this.qtdItem=qtdItem;
    }   

    public float obterValorPagamento(){
        return qtdItem*precoItem;
    }
}
