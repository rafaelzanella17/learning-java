public class Matrizes {

  public static void main(String[] args) {

    double[][] notasAlunos = new double[30][4];


    notasAlunos[0][0] = 10;
    notasAlunos[0][1] = 7;
    notasAlunos[0][2] = 9;
    notasAlunos[0][3] = 9.5;

    notasAlunos[1][0] = 9;
    notasAlunos[1][1] = 8;
    notasAlunos[1][2] = 7;
    notasAlunos[1][3] = 9;

    notasAlunos[2][0] = 8;
    notasAlunos[2][1] = 9;
    notasAlunos[2][2] = 10;
    notasAlunos[2][3] = 7;


    // Imprimir todos os valores e posições
    System.out.println("Imprimindo toda a matriz com posições:");

    for (int linha = 0; linha < notasAlunos.length; linha++) {
      for (int coluna = 0; coluna < notasAlunos[linha].length; coluna++) {
        System.out.println(
          "Posição [" + linha + "][" + coluna + "] = " + notasAlunos[linha][coluna]
        );
      }
    }


    // Imprimir apenas as linhas preenchidas
    System.out.println("\nImprimindo apenas as 3 linhas preenchidas:");

    for (int linha = 0; linha < 3; linha++) {
      for (int coluna = 0; coluna < 4; coluna++) {
        System.out.println(
          "Aluno " + linha + " - Nota " + coluna + ": " + notasAlunos[linha][coluna]
        );
      }
    }      
  }
}
