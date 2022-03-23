package Atividades;

import java.util.Scanner;

public class Atividade1_DIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        calculadora(numero1, numero2);
    }

        public static void calculadora(int primeiroNumero, int segundoNumero){
            int soma = primeiroNumero + segundoNumero;
            int subtracion = primeiroNumero - segundoNumero;
            double division = (double) primeiroNumero / segundoNumero;
            int multiplication = primeiroNumero * segundoNumero;
            System.out.printf("Os resultados são: %n Soma: %d %n Subtração: %d " +
                            "%n Divisão: %f %n Multiplicação: %d",
                    soma, subtracion, division, multiplication);
            // usei o printf pra poder usar uma linha só. %n quebra linha e %d me retorna um numero inteiro de acordo com a ordem das variáveis que eu colocar depois

        }


}