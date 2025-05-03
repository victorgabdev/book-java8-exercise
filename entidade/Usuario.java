package entidade;

public class Usuario {

    // Atributos
    private String nome;
    private int pontos;
    private boolean moderador;

    // construtor
    public Usuario() {}

    public Usuario(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void tornaModerador() {
        this.moderador = true;
    }

    public boolean isModerador() {
        return moderador;
    }

    @Override
    public String toString() {
        return nome + "/" + pontos;
    }
}
