import java.io.*;
public class Estaturas
{
    public static void main(String[] args)
    {
      float [] estaturas = {4.5f, 8.3f, -0.3f};
      int numMayores = 0, numMenores = 0;
      int i = 0;
      while(i <= 2)
      {
          if(estaturas[i] > 0)
              numMayores++;
          else
              numMenores++;
          i++;
          System.out.println(numMayores);
          System.out.println(numMenores);
      }
    }
}