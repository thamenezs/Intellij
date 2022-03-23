package Atividades;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //complete os espaços com sua solução
//        Scanner leitor = new Scanner(System.in);
//        int N = leitor.nextInt();
//        int X, Y;
//        for (int i = 0; i < N; i++) {
//            X = leitor.nextInt();
//            Y = leitor.nextInt();
//            if (Y == 0 ) System.out.println("divisao impossivel");
//            else System.out.printf("%.1f%n", (float) + X / Y );
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            //complete a resolução do problema com sua solução
        String A = scan.next();
        String B = scan.next();
            if (A.endsWith(B)) System.out.println("encaixa");
            else System.out.println("nao encaixa");
        }
    }

}
