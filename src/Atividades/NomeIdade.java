package Atividades;

import java.util.Objects;
import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int age = 0;

        while (true){
             name = sc.next();
             if (name.equals("0")){
                 break;
             }
             age = sc.nextInt();
            System.out.println(name + " " + age);
        }
        }



    }

