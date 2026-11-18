package NIVEL5CONTADOROBJETOS.SAIDA;

import NIVEL5CONTADOROBJETOS.CLASSE.Usuario;

public class Main {
    static void main() {
        Usuario usuario1 = new Usuario("Fernando", "fernando@gmail.com");
        Usuario usuario2 = new Usuario("Babi", "babi@hotmail.com");
        Usuario usuario3  = new Usuario("Alex", "alex@gmail.com");
        Usuario usuario4  = new Usuario("Pedro", "pedro@gmail.com");

        System.out.println("Total de usuarios: " + Usuario.getTotalUsuarios());

        System.out.println(usuario1.getNome() + " Email: " + usuario1.getEmail() + " -> ID " + usuario1.getId());
        System.out.println(usuario2.getNome() + " Email: " + usuario2.getEmail() + " -> ID " + usuario2.getId());
        System.out.println(usuario3.getNome() + " Email: " +usuario3.getEmail()  + " -> ID " + usuario3.getId());
        System.out.println(usuario4.getNome() + " Email: " + usuario4.getEmail() + " -> ID " + usuario4.getId());



    }
}
