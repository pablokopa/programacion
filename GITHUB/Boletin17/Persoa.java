package boletin17;

public class Persoa {
    private String nome;
    private String apelido;
    private String nif;

    public Persoa(String nome, String apelido, String nif) {
        this.nome = nome;
        this.apelido = apelido;
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Persoa{" + "nome=" + nome + ", apelido=" + apelido + ", nif=" + nif + '}';
    }
}
