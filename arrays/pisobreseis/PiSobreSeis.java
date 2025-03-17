package arrays.pisobreseis;

public class PiSobreSeis {
    public static void main(String[] args) {
        double[] termosDeSerie = new double[1000000];

        for (int i = 0; i < termosDeSerie.length; i++) {
            termosDeSerie[i]=1.0/Math.pow(i+1,2);
        }
 
        for (int i = 10; i <= 1000000; i*=10) {
            calculaEMostraSomatorio(termosDeSerie, i);
        }
        
    }
    
    public static void calculaEMostraSomatorio(double [] array, int num) {
        double soma=0.0;
        for (int i = 0; i < num; i++) {
            soma+=array[i];
        }
        System.out.println(soma);
    }
}

