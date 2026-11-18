package NIVEL7ESCOLA.SAIDA;

import NIVEL7ESCOLA.CLASSES.Aluno;
import NIVEL7ESCOLA.CLASSES.Escola;

public class Objetos {
    static void main() {

        Escola escola1 = new Escola("Escola do Zé", "Rua Nelson Rosa");

        Aluno aluno1 = new Aluno("Nando", escola1, "Terceiro Ano");
        Aluno aluno2 = new Aluno("Babi", escola1, "Primeiro Ano");
        Aluno aluno3 = new Aluno("Pedro", escola1, "Segundo Ano");


        escola1.imprimirDados();

        System.out.println("============");

        escola1.imprimirAlunos();

    }
}
