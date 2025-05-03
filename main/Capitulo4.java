package main;

import entidade.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Capitulo4 {
    public static void main(String[] args) {
        // default methods
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);

        /*

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);  // Arrays.asList -> Cria uma lista imutável (UnsupportedOperationException)

        Consumer<Usuario> mostraMensagem =
                usuario -> System.out.println("Antes de imprimir os nomes");

        Consumer<Usuario> imprimeNome =
                usuario -> System.out.println(usuario.getNome());

        usuarios.forEach(mostraMensagem.andThen(imprimeNome));
        */

        // Remover todos os usuários com mais de 160 pontos da nossa colecao
        usuarios.removeIf(usuario -> usuario.getPontos() > 160);  // removeIf -> Interface Funcional Predicate
        usuarios.forEach(u -> System.out.println(u));             // forEach -> Interface Funcional Consumer
    }
}
