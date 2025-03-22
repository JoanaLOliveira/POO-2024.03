package listClassesAbstratasPolimorfismoInterfaces.Exame;

public class ExameImagem implements Exame {
    @Override
    public void mostrarPreparo(){
        System.out.println("EXAME DE IMAGEM PREPARO: ");
        System.out.println("Nenhum preparo necessario. ");
    }
}
