public class ExemploBreakContinue {
  public static void main(String[] args) {
    for(int numero = 1; numero <=5; numero ++){
      if(numero==3)
        break;  // interrompe o laço 
      
      System.out.println(numero);
      
    }

    for(int numero = 1; numero <=5; numero ++){
      if(numero==3)
        continue; // interrompe somente a iteração atual 
      
      System.out.println(numero);
      
    }
  }
}
