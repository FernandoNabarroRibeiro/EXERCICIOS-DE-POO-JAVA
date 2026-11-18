package NIVEL3BOLETIM.Saida;

import NIVEL3BOLETIM.Aluno.Aluno;

public class AlunoTest {
    static void main() {

        Aluno aluno = new Aluno("FERNANDO", "CLYBAS", 8,5,7);

        aluno.exibirBoletim();
        aluno.alunoAprovado();
    }
}
