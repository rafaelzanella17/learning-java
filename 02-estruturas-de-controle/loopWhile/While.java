public class While {

  public static void main(String[] args) {

    int max = 10;
    int i = 1;


    while (i <= max) {
      System.out.println("Valor de i: " + i);
      i++;      
    }
    System.out.println(i);
    

    System.out.println("===========================================");


    do {
      i++;
      System.out.println("Valor de i: " + i);
    } while (i < 13);
    System.out.println(i);
    
  }  
}
