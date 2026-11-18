package NIVEL3BOLETIM.Aluno;

public class Aluno {

    String nome;
    String escola;
    int nota1;
    int nota2;
    int nota3;
    int media;
    public Aluno(String nome, String escola, int nota1, int nota2, int nota3) {
        this.nome = nome;
        this.escola = escola;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscola() {
        return escola;
    }

    public void setMatricula(String matricula) {
        this.escola = matricula;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }


    public int calcularMedia(){
       int somaNotas = nota1 + nota2 + nota3;
      int media = somaNotas / 3;
      return media;
    }

    public void alunoAprovado(){
        if (media>=7){
            System.out.println("Aluno aprovado!");
    }else {
        System.out.println("Aluno reprovado!");}
    }

    public void exibirBoletim(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Escola :" + escola);
        System.out.println("Exibindo notas:");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Media: " + calcularMedia());
        System.out.println("Foi aprovado ou não? ");

    }
}
