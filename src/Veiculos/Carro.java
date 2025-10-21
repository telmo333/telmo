package Veiculos;

public class Carro extends Veiculo {
    private int numeroPortas;
    private boolean descapotavel;

    public Carro(String marca, String modelo, int ano, int numeroPortas, boolean descapotavel) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
        this.descapotavel = descapotavel;
    }

    @Override
    public void modoAcelerar() {
        System.out.println("O carro acelera suavemente com o pedal.");
    }

    public int getNumeroPortas() { return numeroPortas; }
    public void setNumeroPortas(int numeroPortas) { this.numeroPortas = numeroPortas; }

    public boolean isDescapotavel() { return descapotavel; }
    public void setDescapotavel(boolean descapotavel) { this.descapotavel = descapotavel; }
}
