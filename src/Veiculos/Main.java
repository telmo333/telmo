package Veiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Yaris", 2022, 5, false);
        Mota mota = new Mota("Honda", "CB500F", 2023, 500);

        Veiculo v1 = carro;
        Veiculo v2 = mota;

        v1.modoAcelerar();
        v2.modoAcelerar();

        carro.mover();
        mota.parado();

        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo());
        System.out.println("Mota: " + mota.getMarca() + " " + mota.getModelo());
    }
}
