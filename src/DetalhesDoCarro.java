import java.util.Scanner;

public class DetalhesDoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comando;


        do {
            System.out.println("----- Verificação de detalhes do carro -----");

            System.out.print("Digite a marca do carro: ");
            String marca = scanner.nextLine();

            System.out.print("Digite o modelo do carro: ");
            String modelo = scanner.nextLine();

            System.out.print("Digite a cor do carro: ");
            String cor = scanner.nextLine();

            System.out.print("Digite a cilindrada do carro (ex: 2.0): ");
            double cilindrada = scanner.nextDouble();
            scanner.nextLine(); // limpar o buffer

            System.out.print("Digite o ano do carro: ");
            int ano = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            // Escolher tipo de caixa
            boolean automatico = false;
            while (true) {
                System.out.print("Escolha o tipo de caixa: 1 - Automática, 2 - Manual: ");
                if (scanner.hasNextInt()) {
                    int escolha = scanner.nextInt();
                    scanner.nextLine(); // limpar o buffer
                    if (escolha == 1) {
                        automatico = true;
                        break;
                    } else if (escolha == 2) {
                        automatico = false;
                        break;
                    } else {
                        System.out.println("Tem de escolher 1 ou 2!");
                    }
                } else {
                    System.out.println("Entrada inválida. Digite 1 ou 2.");
                    scanner.nextLine(); // descartar valor errado
                }
            }

            // Verificações
            if (marca.equalsIgnoreCase("Audi") || marca.equalsIgnoreCase("BMW") || marca.equalsIgnoreCase("Mercedes")) {
                System.out.println("Carro alemão.");
            } else {
                System.out.println("Outro fabricante.");
            }

            if (cilindrada >= 2.0) {
                System.out.println("Motor potente.");
            } else {
                System.out.println("Motor moderado.");
            }

            if (automatico) {
                System.out.println("Caixa automática.");
            } else {
                System.out.println("Caixa manual.");
            }

            if (ano < 2020) {
                System.out.println("Carro usado (ano inferior a 2020).");
            } else {
                System.out.println("Carro recente.");
            }

            // Exibir resumo
            System.out.println("----- Resumo do carro registado -----");
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Cor: " + cor);
            System.out.println("Cilindrada: " + cilindrada);
            System.out.println("Ano: " + ano);
            System.out.println("Caixa automática: " + (automatico ? "Sim" : "Não"));

            System.out.print("\nSe quiser continuar, pressione Enter. Para sair, escreva 'sair': ");
            comando = scanner.nextLine();

        } while (!comando.equalsIgnoreCase("sair"));

        System.out.println("Programa terminado. Obrigado!");
        scanner.close();
    }


}
