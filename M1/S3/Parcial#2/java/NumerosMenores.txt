import java.io.*;
public class numerosMenores
{
    public static void main(String[] yo)
    {
        float[] listaNumeros = {1.0f, -3.0f, -5.0f};
        float numMenor = 0.0f;
        int nm = 0;
        for(int i = 0; i < listaNumeros.length; i++)
        {
            if(numMenor > listaNumeros[i])
            {
                nm++;

            }


        }
        System.out.println(nm);

    }
}