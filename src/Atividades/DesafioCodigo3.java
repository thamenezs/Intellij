package Atividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DesafioCodigo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        List<Integer> numeros = new ArrayList<>();
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        int numeros;
        int contador = 0;
        int quantidadeDeNumeros = sc.nextInt();

        while (contador < quantidadeDeNumeros){
            numeros = sc.nextInt();
        contador += 1;
        if(numeros % 2 == 0)
            numerosPares.add(numeros);
        else numerosImpares.add(numeros);

        }
        Collections.sort(numerosPares);
        for (int numeraisPares : numerosPares) {
            System.out.println(numeraisPares);
        }
        Collections.sort(numerosImpares, Collections.reverseOrder());
        for (int numeraisImpares : numerosImpares) {
            System.out.println(numeraisImpares);
        }


    }
}