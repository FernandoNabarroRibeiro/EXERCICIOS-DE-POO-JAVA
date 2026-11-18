package NIVEL2CONTABANCARIA.Saida;

import NIVEL2CONTABANCARIA.Conta.ContaBancaria;



public class Saida {
    static void main() {


        ContaBancaria conta1 = new ContaBancaria("Nando", 23, 5000);
        ContaBancaria conta2 = new ContaBancaria("Babi", 26, 6000);

        conta1.saidaConta();
        System.out.println("===SEPARADOR===");
        conta2.saidaConta();







    }
}
