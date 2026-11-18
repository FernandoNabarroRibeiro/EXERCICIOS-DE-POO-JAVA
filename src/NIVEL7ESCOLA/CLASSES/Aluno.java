package NIVEL7ESCOLA.CLASSES;

public class Aluno {
    Escola escola;
    private String nome;
    private String matricula;

    public Escola getEscola() {
        return escola;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public Aluno(String nome, Escola escola, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.escola = escola;
        escola.adicionarAluno(this);
    }


}
