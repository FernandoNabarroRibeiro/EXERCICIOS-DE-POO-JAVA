package NIVEL7ESCOLA.CLASSES;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    private String nome;
    private String endereço;

    public Escola(String nome, String endereço) {
        this.nome = nome;
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void imprimirDados() {
        System.out.println("ESCOLA:");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereço());

    }

    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void imprimirAlunos() {
        System.out.println("Alunos da escola: " + nome);
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + " | Matrícula: " + aluno.getMatricula());
        }
    }
}
