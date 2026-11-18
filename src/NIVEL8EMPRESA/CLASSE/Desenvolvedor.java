package NIVEL8EMPRESA.CLASSE;

public class Desenvolvedor extends Funcionario {

    final String linguagemPrincipal;


    public Desenvolvedor(String nome, double salario, String matricula, String linguagemPrincipal) {
        super(nome, salario, matricula);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "linguagemPrincipal='" + linguagemPrincipal + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
