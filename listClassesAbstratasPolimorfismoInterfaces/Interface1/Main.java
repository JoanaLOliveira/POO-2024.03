package listClassesAbstratasPolimorfismoInterfaces.Interface1;

public class Main {
    public static void main(String[] args) {
        Interface1 x = new Concreta1();
        System.out.println(x.metodoComum());
        System.out.println(x.medotoExotico());
    }
}
