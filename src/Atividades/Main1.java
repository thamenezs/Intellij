package Atividades;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        // aqui estou chamando o codigo que criei com o método e dando o valor do parametro
//        Atividade2_DIO.respondeAHora(22);
////        atividade3_dio.area(19.3);
////        atividade3_dio.area(13, 14, 11);
////        atividade3_dio.area(11,4);
//
//        double areaQuadrado = atividade3_dio.area(13);
//        double areaTrapezio = atividade3_dio.area(1,4,7);
//        double areaRetangulo = atividade3_dio.area(15,56);
//
//        System.out.println("Área do quadrado: " + areaQuadrado + "\nÁrea do trapézio: " + areaTrapezio
//                + "\nÁrea do retangulo: " + areaRetangulo);

        int minutos;
        Scanner input = new Scanner(System.in);
        minutos = input.nextInt();
        int K = (minutos) * 2;
        System.out.printf("%d minutos\n", K);

    }
}