package Atividades;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int soma = 0;
        int maior = 0;
        int numero;

        do {
            numero = sc.nextInt();
            soma = soma + numero;
            if(numero > maior){
                maior = numero;
            }
            contador = contador + 1;
        } while(contador < 5);
        System.out.println("Média: " + (soma /5));
        System.out.println("Maior: " + maior);
    }
}
