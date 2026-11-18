package NIVEL2CONTABANCARIA.Conta;

public class ContaBancaria {
    String  titular;
    int numero;
    double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void exibirDados(){
        System.out.println("Titular: " + this.titular);
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }

    public void  depositar(double valor){
        if(valor>0){
            saldo+=valor;
            System.out.println("Depositado com sucesso");
            System.out.println("Saldo atual: "+saldo);
        } else{
            System.out.println("O valor deve ser positivo");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            saldo -= valor;
        } else {
            System.out.println("O valor deve ter na Conta Bancaria");
        }
    }
 public void saidaConta(){
     System.out.println("Dados do Conta Bancaria");
     exibirDados();
     System.out.println("========");
     System.out.println("Valor depositado: 2000");
     depositar(2000);
     System.out.println("Sacar saldo valor de: 1000");
     sacar(1000);
     System.out.println("Saldo atual: " + getSaldo());
     System.out.println("===========");
     exibirDados();

 }










}
