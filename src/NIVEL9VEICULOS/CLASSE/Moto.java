package NIVEL9VEICULOS.CLASSE;

public class Moto extends Veiculo {


    private String cilindragem;


    public Moto(String marca, String modelo, String ano, String cilindragem) {
        super(marca, modelo, ano);
        this.cilindragem = cilindragem;
    }

    @Override
    public String toString() {
        return super.toString() +
         "Moto{" +
                "cilindragem='" + cilindragem + '\'' +
                '}';
    }

}
