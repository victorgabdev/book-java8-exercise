package main;

import entidade.Usuario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

public class Capitulo6 {

    public static void main(String[] args) {

        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);

        usuarios.forEach(Usuario::tornaModerador);  // mesma coisa
        usuarios.forEach(u -> u.tornaModerador());  // mesma coisa

        // Expressao lambda para ordenação
        usuarios.sort(comparing(u -> u.getNome()));
        // Method Reference para ordenação
        usuarios.sort(comparing(Usuario::getNome));

        // Import estático
        Function<Usuario, String> byName = Usuario::getNome;  // method reference
        Function<Usuario, String> byName2 = usuario -> usuario.getNome();  // lambda expression
        usuarios.sort(comparing(byName));

        // Comparando pontos
        usuarios.sort(comparingInt(Usuario::getPontos));

        usuarios.sort(Comparator.comparingInt(Usuario::getPontos)
                .thenComparing(Usuario::getNome));

        // Nomes nulos vão ser ordenanos no final
        usuarios.sort(Comparator.nullsLast(
                Comparator.comparing(Usuario::getNome)));

        Usuario victor = new Usuario("Victor Gabriel", 50);
        Runnable block = victor::tornaModerador;
        block.run();

        usuarios.forEach(System.out::println);

    }
}
