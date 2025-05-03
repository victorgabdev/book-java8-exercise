package main;

import entidade.Validador;

public class Capitulo3 {
    public static void main(String[] args) {
        Validador<String> validadorCEP =
                valor -> valor.matches("[0-9]{5}-[0-9]{3}");

        Runnable o = () -> System.out.println("O que sou eu? Que lambda?");

        System.out.println(o);
        System.out.println(o.getClass());

    }
}
