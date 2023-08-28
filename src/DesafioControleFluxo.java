import java.util.Scanner;

public class DesafioControleFluxo {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
    System.out.print("Digite o primeiro parâmetro: ");
    int paramOne = terminal.nextInt();

    System.out.print("Digite o segundo parâmetro: ");
    int paramTwo = terminal.nextInt();
    terminal.nextLine();
    
    try {
      contar(paramOne, paramTwo);
    } catch (ParametrosInvalidosException exception) {
      System.out.print(exception.getMessage() + "\n");
    }
    
    terminal.close();
  }

  static void contar(int paramOne, int paramTwo) throws ParametrosInvalidosException {
    if (paramOne > paramTwo) {
      throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    } else {
      int count = paramTwo - paramOne;

      for (int num = 1; num <= count; num++) {
        System.out.print("Imprimindo número " + num + "\n");
      }
    }
  }
}
  
