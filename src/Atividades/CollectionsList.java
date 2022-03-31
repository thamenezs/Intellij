package Atividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsList {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();
        notas.add(4.0);
        notas.add(7.0);
        notas.add(3.4);
        notas.add(3.5);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(6.0);
        System.out.println(notas);

        System.out.println("Mostra a posição do da nota 7.0" + notas.indexOf(7.0));

        System.out.println("Adiciona na lsta a nota 8.0 na posição 4");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitui a nota 6.0 por 7.0 ");
        notas.set(notas.indexOf(6.0), 9.0);
        System.out.println(notas);

        System.out.println("Confere se a nota 5.0 está na lista \n" + notas.contains(5d));

        System.out.println("Mostrar todas as notas na ordem");

        for (Double nota: notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada "+ notas.get(2));
        //exibir a menor nota
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();

        double soma = 0.0;
        while (iterator.hasNext()) { //has next responde se tem um numero depois dele
        Double next = iterator.next();
        soma = soma + next;
        }
        System.out.println(soma);

        System.out.println("média das notas: " + (soma / notas.size()));

        notas.remove(0d); //remove a nota 0 da lista
        notas.remove(0); //remove a posição 0 da lista

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
            //aqui estou removendo da lista as notas menores que 7
        }

        System.out.println(notas);
//
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println("Nota está vazia? " + notas.isEmpty());
        notas.add(3.0);


    }
}
