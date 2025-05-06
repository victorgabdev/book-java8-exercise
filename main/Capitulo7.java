package main;

import entidade.Usuario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Capitulo7 {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        Usuario user4 = new Usuario("Juliana Castro", 175);
        Usuario user5 = new Usuario("Rafael Oliveira", 130);
        Usuario user6 = new Usuario("Camila Fernandes", 160);
        Usuario user7 = new Usuario("Bruno Costa", 50);
        Usuario user8 = new Usuario("Mariana Souza", 200);
        Usuario user9 = new Usuario("Diego Almeida", 140);
        Usuario user10 = new Usuario("Paula Mendes", 30);

        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        usuarios.add(user4);
        usuarios.add(user5);
        usuarios.add(user6);
        usuarios.add(user7);
        usuarios.add(user8);
        usuarios.add(user9);
        usuarios.add(user10);

        // filtrar os 10 usuarios com mais pontos e torná-los moderadores
        //usuarios.sort(Comparator.comparingInt(Usuario::getPontos).reversed());  // maior para o menor
        //usuarios.forEach(System.out::println);

        // filtrar todos os usuários que têm mais de 100 pontos
        //Maneira Antiga
        //for (Usuario usuario : usuarios) {
            //if(usuario.getPontos() > 100) usuario.tornaModerador();
        //}

        // Transformando os 10 usuarios com mais pontos moderadores
        //usuarios.sort(Comparator.comparingInt(Usuario::getPontos).reversed());  // ordenando a lista usuario por pontos de forma decrescente
        //suarios.subList(0, 10).forEach(Usuario::tornaModerador);  // Lista usuarios ordenado de forma decrescente por pontos, pega somente 10 usuarios e torna moderador

        // Filtrar todos usuarios que tem mais de 100 pontos
        // maneira antiga
        //for(Usuario usuario : usuarios) {
            //if (usuario.getPontos() > 100) usuario.tornaModerador();
        //}

        usuarios.stream()
                .filter(usuario -> usuario.getPontos() > 100)
                .forEach(Usuario::tornaModerador);  // method reference

        // filtrar os usuarios que sao moderadores
        usuarios.stream()
                .filter(Usuario::isModerador)
                .forEach(System.out::println);


    }
}
