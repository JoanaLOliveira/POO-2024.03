package arrays.damas;

public class JogoDeDamas {
    private static final int LINHAS = 8;
    private static final int COLUNAS = 8;
    private char[][] tabuleiro;

    JogoDeDamas (){
        tabuleiro = new char[LINHAS][COLUNAS];
        for (int l = 0; l < tabuleiro.length; l++) {
            for (int c = 0; c < tabuleiro[l].length; c++) {
                tabuleiro[l][c]='.';
            }
        }
    }
    /* time O */
    for (int l = 0; l <= 2; l++) {
        int comeco = (l%2==0)?l:0;
        for (int c = comeco; c < tabuleiro[l].length; c+=2) {
            tabuleiro[l][c]='O';
        }
    }

    /* time X */
    for (int l = 5; l <= 7; l++) {
        int comeco = (l%2==0)?l:0;
        for (int c = comeco; c < tabuleiro[l].length; c+=2) {
            tabuleiro[l][c]='X';
        }
    }

    @Override
    public String toString() {
        String rep = "";
        for (int l = 0; l < tabuleiro.length; l++) {
            for (int c = 0; c < tabuleiro[l].length; c++) {
                rep += tabuleiro[l][c]='  ';
            }
            rep +="\n";
        }
        return rep;
    }

}
