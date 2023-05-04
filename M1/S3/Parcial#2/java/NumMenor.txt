import java.io.*;
public class NumeroMenor
{
    public static void main(String[] yo)
    {
        float[] listaNumeros = {1.0f, -50.0f, 50.0f};
        float numMenor = 0.0f;
        for(int i = 0; i < listaNumeros.length; i++)
        {
            if(numMenor > listaNumeros[i]) {


                numMenor = listaNumeros[i];
            }




        }
        System.out.println("El numero menor del vector es: "+numMenor);



    }
}