package aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dominio.Pessoa;

public class Programa {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(1, "Pedro", "pedro@gmail.com");
        Pessoa p2 = new Pessoa(2, "Kauã", "kaua@gmail.com");
        Pessoa p3 = new Pessoa(3, "Henrique", "henrique@gmail.com");

        List<Pessoa> pessoas = new ArrayList<>(Arrays.asList(p1, p2, p3));

        pessoas.forEach(System.out::println);

    }
}
