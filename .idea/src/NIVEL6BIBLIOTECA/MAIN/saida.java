package NIVEL6BIBLIOTECA.MAIN;

import NIVEL6BIBLIOTECA.CLASSE.Biblioteca;
import NIVEL6BIBLIOTECA.CLASSE.Livro;

public class saida {
    public static void main(String[] args) {

       Biblioteca biblioteca = new Biblioteca();
       biblioteca.lerLivros();

        Livro encontrado = biblioteca.buscarPorTitulo("Cobra Kai");

        System.out.println("=========");

        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getTitulo()
                    + " - " + encontrado.getAutor()
                    + " (" + encontrado.getAnoPublicacao() + ")");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
