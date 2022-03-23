package Atividades;

import java.util.Scanner;

public class Note {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int note;

        while(true){
            System.out.println("Nota:");
            note = sc.nextInt();
            if(note < 0 || note > 10){
                System.out.println("Valor inválido");
            }else {
                System.out.println("Sua nota é: " + note);
                break;
            }
        }
    }
}
