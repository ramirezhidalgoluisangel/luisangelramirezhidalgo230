import java.io*;
public class ParImpar
{
    public static void main(String[] args)
    {
       int num = 10;
       int parimpar = 0;
       parimpar = num % 2;
       if (parimpar == 0)
       {
           System.out.println("PAR");

       }else
       {
           System.out.println("IMPAR");
       }




    }
}