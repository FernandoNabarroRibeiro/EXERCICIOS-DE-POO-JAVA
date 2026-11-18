package NIVEL8EMPRESA.CLASSE;

public class Funcionario {

    protected String nome;
    protected double salario;
    protected String matricula;

    public Funcionario(String nome, double salario, String matricula) {
        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return super.toString();

    }
}
