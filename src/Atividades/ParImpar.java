package Atividades;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int quantidadeDeNumeros = 0;
        int contador = 0;
        int pares = 0;
        int impares = 0;

        quantidadeDeNumeros = sc.nextInt();
        do {
            n = sc.nextInt();
            if(n % 2 == 0){
            pares = pares + 1;
        }else impares = impares + 1;

        contador = contador + 1;
        }while (contador < quantidadeDeNumeros);

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
