package Atividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsOrdenacao {
    public static void main(String[] args) {
        List<Gato> gatinhos = new ArrayList<>(){{
        add(new Gato("Yuri", 7, "rajado"));
        add(new Gato("Yara", 2, "branca"));
        add(new Gato("Yan", 2, "cinza"));
        }};

        System.out.println(gatinhos);

        //ordem aleatoria
        Collections.shuffle(gatinhos);
        System.out.println(gatinhos);

        Collections.sort(gatinhos);
        System.out.println(gatinhos);
    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private String cor;
    private int idade;

    public Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;

    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome() .compareToIgnoreCase(gato.getNome());
    }
}