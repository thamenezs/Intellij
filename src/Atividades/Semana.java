package Atividades;

import java.util.Scanner;

public class Semana {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String weekDay = sc.next();
        int number;
        switch (weekDay){
            case "domingo":
                number = 1;
                break;
            case "segunda":
                number = 2;
                break;
            case "terça":
                number = 3;
                break;
            case "quarta":
                number = 4;
                break;
            case "quinta":
                number = 5;
                break;
            case "sexta":
                number = 6;
                break;
            case "sabado":
                number = 7;
                break;
            default:
                number = 80;
                System.out.println("Dia errado otario");
        }

        System.out.println(number);
        switch (number){
            case 1,2,3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }
}
