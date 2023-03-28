import java.io.*;
import java.util.Scanner;
class suma
  {  
   public static void main(String[] args)
     {
      Scanner entrada = new Scanner(System.in);
      float nota1,nota2,suma;// Variables.
      nota1 = entrada.nextFloat();
      nota2 = entrada.nextFloat();
      suma = nota1 + nota2;
      System.out.print("La SUMA es:"+suma);
     } 
   }