import java.io.*;
class For 
{
    public static void main (String[] args)
    {
      int [] buscar = {8,0,-4};
      int e=0, numB=0, numE=0;
      while (e<3)
      {
        if (numB== buscar[e])
          numE=1;
        else
          numE=0;  e=3; break;
      }
    if (numE ==1)
      System.out.println("Numero encontrado");
    else 
      System.out.println("Numero No encontrado");
}
}