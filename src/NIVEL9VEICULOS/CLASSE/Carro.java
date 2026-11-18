package NIVEL9VEICULOS.CLASSE;

public class Carro extends Veiculo {

    private String cor;
    private String motor;

    public Carro(String marca, String modelo, String ano, String cor, String motor) {
        super(marca, modelo, ano);
        this.cor = cor;
        this.motor = motor;
    }



    @Override
    public String toString() {
        return super.toString() +
        "Carro{" +
                "cor='" + cor + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }
}
