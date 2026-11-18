package NIVEL8EMPRESA.CLASSE;

public class Gerente extends Funcionario {

   final private String departamento;



    public Gerente(String nome, double salario, String matricula, String departamento) {
        super(nome, salario, matricula);
        this.departamento = departamento;
    }


    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}

