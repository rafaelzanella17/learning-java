// Arquivo: Variaveis.java
// Este arquivo demonstra os tipos de variáveis mais usados em Java,


public class Variaveis {

    public static void main(String[] args) {

        // String: armazena textos
        String nome = "Rafael";

        // int: números inteiros (sem casas decimais)
        int idade = 30;

        // double: números decimais (ponto flutuante)
        double altura = 1.82;

        // float: números decimais (precisão menor que double)
        float peso = 75.5f; // precisa do 'f' no final

        // char: armazena um único caractere
        char inicial = 'R';

        // boolean: valores verdadeiro ou falso
        boolean ativo = true;

        // byte: inteiro pequeno (-128 até 127)
        byte nivel = 10;

        // short: inteiro curto (-32.768 a 32.767)
        short quantidade = 1500;

        // long: inteiros longos (necessita 'L' no final)
        long populacao = 8000000L;

        // ---------------------------------------------
        // EXIBINDO AS VARIÁVEIS
        // ---------------------------------------------
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Inicial: " + inicial);
        System.out.println("Ativo: " + ativo);
        System.out.println("Nivel (byte): " + nivel);
        System.out.println("Quantidade (short): " + quantidade);
        System.out.println("População (long): " + populacao);


        // ---------------------------------------------
        // OBSERVAÇÕES IMPORTANTES
        // ---------------------------------------------
        // - Java é fortemente tipado: cada variável deve ter um tipo definido.
        // - Os tipos primitivos (int, double, boolean, etc.) NÃO são objetos.
        // - String é uma classe (não é tipo primitivo).
        // - Variáveis devem sempre começar com letra minúscula (boa prática).
        // - Para valores muito grandes, prefira o tipo long.
        //
        // --- COMPILAR O ARQUIVO ---
        // javac Variaveis.java
        //
        // --- EXECUTAR O ARQUIVO ---
        // java Variaveis

    }
}
