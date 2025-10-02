import java.util.ArrayList;

public class StockVeiculos {


    public static String registoVeiculos() {
        String[] marcas = {"BMW", "Audi", "Mercedes", "Toyota", "Honda"};
        int[] anos = {2020, 2018, 2022, 2015, 2019};
        double[] precos = {45000, 38000, 60000, 20000, 25000};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < marcas.length; i++) {
            sb.append("Marca: ").append(marcas[i])
                    .append(", Ano: ").append(anos[i])
                    .append(", Preço: ").append(precos[i]).append("€\n");
        }
        return sb.toString();
    }


    public static String[] detalhesVeiculos(String[] marcas, int[] anos, double[] precos) {
        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < marcas.length; i++) {
            if (anos[i] > 2018) {
                lista.add("Veículo recente: " + marcas[i] + " (" + anos[i] + ")");
            }
        }

        return lista.toArray(new String[0]);
    }


    public static String[] filtrosVeiculos(String[] marcas, int[] anos, double[] precos) {
        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < marcas.length; i++) {
            if (precos[i] < 30000) {
                lista.add("Veículo económico: " + marcas[i] + " - " + precos[i] + "€");
            }
        }

        return lista.toArray(new String[0]);
    }


    public static void main(String[] args) {

        System.out.println("=== Registo de Veículos ===");
        System.out.println(registoVeiculos());


        String[] marcas = {"BMW", "Audi", "Mercedes", "Toyota", "Honda"};
        int[] anos = {2020, 2018, 2022, 2015, 2019};
        double[] precos = {45000, 38000, 60000, 20000, 25000};


        System.out.println("\n=== Detalhes dos Veículos ===");
        for (String s : detalhesVeiculos(marcas, anos, precos)) {
            System.out.println(s);
        }

        
        System.out.println("\n=== Filtros de Veículos ===");
        for (String s : filtrosVeiculos(marcas, anos, precos)) {
            System.out.println(s);
        }
    }
}
