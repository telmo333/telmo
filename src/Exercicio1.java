import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio1 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Tavares");
        nomes.add("Telmo");
        for (String nome: nomes) {
            System.out.println("Ola" +nome);
        }
    }
}
