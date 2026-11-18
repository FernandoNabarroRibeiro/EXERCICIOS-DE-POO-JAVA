package NIVEL6BIBLIOTECA.CLASSE;

public class Autor {
    private String nome;
    private String idade;

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public Autor(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
