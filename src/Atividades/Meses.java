package Atividades;

import java.util.Scanner;

public class Meses {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();

        if (mes == 1){
            System.out.println("Janeiro");
            } else if (mes == 2){
            System.out.println("Fevereiro");
        }   if (mes == 3){
            System.out.println("Março");
        }   if (mes == 7){
            System.out.println("Julho");
        }   if (mes  == 12){
            System.out.println("Dezembro");
        }   if (mes == 1 || mes == 12 || mes == 7){
            System.out.println("Vacation!!");
        }
        }
    }
