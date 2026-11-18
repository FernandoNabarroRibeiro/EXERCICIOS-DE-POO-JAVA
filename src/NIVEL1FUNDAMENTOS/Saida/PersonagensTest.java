package NIVEL1FUNDAMENTOS.Saida;

import NIVEL1FUNDAMENTOS.Personagens.Personagens;

public class PersonagensTest {
    static void main() {

        Personagens p1 = new Personagens("Babi", 15, 50);
        Personagens p2 = new Personagens("Nando", 17, 100);

        System.out.println("===PERSONAGEM 1===");
    p1.exibirDados();
        System.out.println("===PERSONAGEM 2===");
    p2.exibirDados();

        System.out.println("Personagem: Babi " +  "Atacou personagem: Nando");
        System.out.println("Personagem Nando Levou 50 de Dano");
        System.out.println("Força atual de Nando: ");
        p2.perderForca();

    }

}
