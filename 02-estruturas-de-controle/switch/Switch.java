public class Switch {
  
  public static void main(String[] args) {
    
  int opcao = 2;

    switch (opcao) {
      case 1:
          System.out.println("Você escolheu: Iniciar");
          break;
      case 2:
          System.out.println("Você escolheu: Configurações");
          break;
      case 3:
          System.out.println("Você escolheu: Sair");
          break;
      default:
          System.out.println("Opção inválida.");
    }
  }
}
