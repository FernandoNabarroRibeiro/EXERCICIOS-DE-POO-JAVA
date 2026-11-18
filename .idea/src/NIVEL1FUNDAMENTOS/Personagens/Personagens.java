package NIVEL1FUNDAMENTOS.Personagens;

public class Personagens {
    String nome;
    int idade;
    int forca;


    public Personagens(String nome, int idade, int forca) {
        this.nome = nome;
        this.idade = idade;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void exibirDados(){
        System.out.println("EXIBINDO DADOS: ");
        System.out.println("NOME: " + this.nome);
        System.out.println("IDADE: " + this.idade);
        System.out.println("FORÇA: " + this.forca);
        }

   public void perderForca(){
       System.out.println(forca - 50);

   }
    }

