package Veiculos;

public class Mota extends Veiculo {
    private int cilindrada;

    public Mota(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public void modoAcelerar() {
        System.out.println("A mota acelera rapidamente com o punho.");
    }

    public int getCilindrada() { return cilindrada; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }
}
