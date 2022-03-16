package tipos;

import java.util.Scanner;

public class Atividade2_DIO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int horas = sc.nextInt();
        respondeAHora(horas);

    }
    public static void respondeAHora(int horaDoDia){
        if (horaDoDia < 12){
            System.out.println("Bom dia");
        }else if (horaDoDia >= 18){
            System.out.println("Boa noite");
        }else {
            System.out.println("Boa tarde");
        }
    }
}
