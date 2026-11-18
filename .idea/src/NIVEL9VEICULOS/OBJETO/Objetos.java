package NIVEL9VEICULOS.OBJETO;

import NIVEL9VEICULOS.CLASSE.Carro;
import NIVEL9VEICULOS.CLASSE.Moto;

public class Objetos {
    static void main() {

        Carro[] carros = new Carro[3];
        carros[0] = new Carro("Ford", "Fusion", "2024", "Preto", "V8");
        carros[1] = new Carro("Cheve", "Corvette", "2026", "Vermelho", "V12");
        carros[2] = new Carro("honda", "HRV", "2022", "Branco", "V6");


        Moto[] motos = new Moto[3];
        motos[0] = new Moto("Honda", "Cg", "2026", "160");
        motos[1] = new Moto("Honda", "CBR", "2012", "600");
        motos[2] = new Moto("Harley", "883", "2016", "450");
        

        for (Carro carro : carros) {
            System.out.println(carro);
        }

        System.out.println("===========");


        for (Moto moto : motos) {
            System.out.println(moto);
        }
    }
}
