package Atividades;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class CollectionsMap {
    public static void main(String[] args) {


        System.out.println("Crie um dicionário que relacione modelos e seus respectivos consumos");

        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15.7");
        carrosPopulares.put("gol", 15.7);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o carro pollo está no dicionário");
        System.out.println(carrosPopulares.containsKey("pollo"));


        System.out.println("Exiba o valor do consumo do uno \n" + carrosPopulares.get("uno"));

        System.out.println("exiba os modelos");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo");
        Double consumoMaisEconomico = Collections.max(carrosPopulares.values());


        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEconomico = "";

        for (Map.Entry<String, Double> entry: entries){
            if (entry.getValue().equals(consumoMaisEconomico))
                modeloMaisEconomico = entry.getKey();

        }
        System.out.println("Modelo mais eficiente: " + modeloMaisEconomico + " " + consumoMaisEconomico);

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()){
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
            }
        }
        System.out.println("Modelos menos eficiente: " + modeloMenosEficiente + " " + consumoMenosEficiente);

        System.out.println("Exiba a soma dos consumos");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            soma = soma + iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exiba a média dos consumos");
        System.out.println(soma / carrosPopulares.size());

        System.out.println("Remova os modelos com consumo igual a 15.6");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();

        System.out.println(carrosPopulares);
        while(iterator1.hasNext())
            if(iterator1.next().equals(15.6)) iterator1.remove();

        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem que foram informados: ");
        Map<String, Double> carrosPopulares1 = carrosPopulares;
        carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("Exiba o dicionário ordenado por modelo: ");
        TreeMap<Object, Object> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionário de carros :( ");
        carrosPopulares.clear();

        System.out.println("O dicionário está vazio? " + carrosPopulares.isEmpty());
    }
}
