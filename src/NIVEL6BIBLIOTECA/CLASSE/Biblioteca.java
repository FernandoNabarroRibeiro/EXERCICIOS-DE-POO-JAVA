package NIVEL6BIBLIOTECA.CLASSE;

public class Biblioteca {
    Autor autor;


    Livro[] livro = {
            new Livro("Pinoquio", "Francisco", 1999),
            new Livro("Cobra e leão", "Carlos", 2005),
            new Livro("Cobra Kai", "Pedro Alves", 1987)
    };

    public void lerLivros() {
        System.out.println("Livros da biblioteca e seus autores: ");
        for (Livro item : this.livro) {
            System.out.println(item.getTitulo() + " - " + item.getAutor() + " - " + "Data Publicação: " + item.getAnoPublicacao());
        }
    }

        public Livro buscarPorTitulo(String titulo){
            for (Livro item : this.livro) {
                if (item.getTitulo().equalsIgnoreCase(titulo)) {
                 return item;
                }
            }
            return null;
        }
    }

