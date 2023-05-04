import java.io.*;
public class NumeroMayor
{
    public static void main(String[] yo)
    {
        float[] listaNumeros = {1f, 3f, 2f,};
        float numMayor = 0.0F;
        for(int i = 0; i <= 2; i++)
        {
            if(numMayor > listaNumeros[i]) {

                numMayor = numMayor;
            }

               else{
                    numMayor = listaNumeros[i];
                }




        }
        System.out.println(numMayor);



    }
}