public class ResultadoEscolar {  //estrutura condicional composta
  // OBS: em uma condição if/else as vezes necessitamos adicionar um bloco de { } se a lógica conter mais de uma linha.
  public static void main(String[] args) { 
    int nota = 6;
       
    if(nota >= 7)
     System.out.println("Aprovado");
 // estrutura condicional encadeada, mais de duas condições 
     else if (nota >=5 && nota <7 )
     System.out.println("Recuperação");
    else
     System.out.println("Reprovado");
  }
}
