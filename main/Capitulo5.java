package main;

import entidade.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Capitulo5 {
    public static void main(String[] args) {
        // Collections

        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);

        usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));

    }
}

