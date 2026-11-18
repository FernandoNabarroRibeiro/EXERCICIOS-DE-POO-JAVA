package NIVEL5CONTADOROBJETOS.CLASSE;

public class Usuario {

    private static int totalUsuarios = 0;
    private final int id;
    private String nome;
    private String email;

    //inicia sempre que houver um objeto
    {
        System.out.println("Inicializando um novo usuario...");
    }

    public Usuario(String nome, String email) {
        totalUsuarios++;  // incrementa o contador
        this.id = totalUsuarios;  // define o id
        this.nome = nome;
        this.email = email;
    }

    //metodo estatico chamado pela CLASSE nao pelo objeto
    public static int getTotalUsuarios() {
        return totalUsuarios;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }


}
