public class BreakContinue {

  public static void main(String[] args) {

    // Exemplo de BREAK
    for (int i = 1; i <= 10; i++) {
        if (i == 5) {
            break; // interrompe o loop quando i for 5
        }
        System.out.println("Break exemplo - valor: " + i);
    }

    System.out.println("-----------------------------");

    // Exemplo de CONTINUE
    for (int i = 1; i <= 10; i++) {
        if (i % 2 == 0) {
            continue; // pula números pares
        }
        System.out.println("Continue exemplo - valor: " + i);
    }   
  } 
}
