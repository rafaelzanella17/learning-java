public class Arrays {

  public static void main(String[] args) {

  // Criando um array de inteiros
    int[] numeros = {10, 20, 30, 40, 50};

    System.out.println("Imprimir um único item do array pelo indice " + numeros[0]);
    System.out.println("============================================");

    // Imprimindo cada elemento usando for
    System.out.println("Imprimindo com for padrão:");
    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Posição " + i + ": " + numeros[i]);
    }

    // Imprimindo usando for-each (mais simples)
    System.out.println("\nImprimindo com for-each:");
    for (int numero : numeros) {
        System.out.println(numero);
    } 
    
    // Outro exemplo abaixo
    System.out.println("=======================================");
    double[] temperaturas = new double[15];

    System.out.println("Tamanho do array: " + temperaturas.length);

    temperaturas[0] = 30.3;
    temperaturas[1] = 24.9;
    temperaturas[3] = 16;
    temperaturas[4] = 38.8;
    temperaturas[8] = 11;
    temperaturas[9] = 4.4;

    for (int i = 0; i < temperaturas.length; i++) {
      System.out.println("posição: " + i + ": " + temperaturas[i]);
    }
  }  
}
