package set.Convidados;

public class Convidado {
    private String nome;
    private String numeroConvite;


    public Convidado(String nome, String numeroConvite) {
        this.nome = nome;
        this.numeroConvite = numeroConvite;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroConvite() {
        return numeroConvite;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroConvite(String numeroConvite) {
        this.numeroConvite = numeroConvite;
    }

    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", numeroConvite=" + numeroConvite + "]";
    }
}
