
package variaveis;

import java.util.Scanner;

public class Questão01 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);      
    
    System.out.println("Escreva o primeiro numero: "); 
        int num1 = scanner.nextInt();   
       
    System.out.println("Escreva o segundo numero: "); 
        int num2 = scanner.nextInt();
        
        int sub = num1 - num2;
        int ad = num1 + num2;
        int mul = num1 * num2;
        int div = num1 / num2;
    
    System.out.println("SUBTRAÇÃO: " + sub);
    System.out.println("ADIÇÃO: " + ad);
    System.out.println("MULTIPLICAÇÃO: " + mul);
    System.out.println("DIVISÃO: " + div);
    
  }
}

