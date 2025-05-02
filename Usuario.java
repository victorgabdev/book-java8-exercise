public class Usuario {

    // Atributos
    private String nome;
    private int pontos;
    private boolean moderador;

    // construtor
    public Usuario() {}

    public Usuario(String nome, int pontos, boolean moderador) {
        this.nome = nome;
        this.pontos = pontos;
        this.moderador = moderador;
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public boolean isModerador() {
        return moderador;
    }

    public void setModerador(boolean moderador) {
        this.moderador = moderador;
    }
}
