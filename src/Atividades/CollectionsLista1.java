package Atividades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsLista1 {
    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>();
        temperaturas.add(30.0);
        temperaturas.add(27.5);
        temperaturas.add(24.0);
        temperaturas.add(28d);
        temperaturas.add(25d);
        temperaturas.add(18d);

        System.out.println(temperaturas);

        Iterator<Double> iterator = temperaturas.iterator();
        double soma = 0.0;
        while (iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma das temperaturas: " + soma);
        double media = soma / temperaturas.size();
        System.out.printf("Média das temperaturas: %.2f%n", media);

        Iterator<Double> iterator1 = temperaturas.iterator();
        while (iterator1.hasNext()){
            double next = iterator1.next();
            if (next > media) System.out.println("Maior que a média: " + next);
        }
    }

}
