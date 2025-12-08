import java.util.Scanner;

public class LeituraCompletaScanner {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // ================================
        // 1. Leitura de texto completo (String)
        // ================================
        System.out.println("Digite seu nome completo:");
        String nomeCompleto = leitura.nextLine();

        // ================================
        // 2. Leitura de texto simples (uma palavra)
        // ================================
        System.out.println("Digite sua cidade (uma palavra):");
        String cidade = leitura.next();

        // ================================
        // 3. Leitura de inteiro (int)
        // ================================
        System.out.println("Digite sua idade:");
        int idade = leitura.nextInt();

        // ================================
        // 4. Leitura de número decimal (double)
        // ================================
        System.out.println("Digite sua altura (ex: 1.75):");
        double altura = leitura.nextDouble();

        // ================================
        // 5. Leitura de número decimal simples (float)
        // ================================
        System.out.println("Digite seu peso (ex: 70.5):");
        float peso = leitura.nextFloat();

        // ================================
        // 6. Leitura de booleano (true/false)
        // ================================
        System.out.println("Você gosta de café? (true/false):");
        boolean gostaCafe = leitura.nextBoolean();

        // ================================
        // 7. Leitura de um único caractere (char)
        // ================================
        System.out.println("Digite a inicial do seu nome:");
        char inicial = leitura.next().charAt(0);

        // Exibição dos valores
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Cidade: " + cidade);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Gosta de café: " + gostaCafe);
        System.out.println("Inicial: " + inicial);

        // Boa prática: fechar o Scanner
        leitura.close();
    }
}