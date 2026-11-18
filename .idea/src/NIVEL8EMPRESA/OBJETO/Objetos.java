package NIVEL8EMPRESA.OBJETO;

import NIVEL8EMPRESA.CLASSE.Desenvolvedor;
import NIVEL8EMPRESA.CLASSE.Gerente;

public class Objetos {
    static void main() {

        Gerente gerente = new Gerente("Fernando", 7000, "001", "Segundo andar");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Babi", 3000, "002", "Phyton");

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
