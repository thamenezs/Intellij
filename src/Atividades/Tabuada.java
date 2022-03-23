package Atividades;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tabuadaDesejada = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            int resultado = tabuadaDesejada * i;
            System.out.println(tabuadaDesejada + " X " + i + " = " + resultado);
        }
    }
}