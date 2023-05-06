import java.io.*;
public class NumeroMayor
{
    public static void main(String[] yo)
    {
        float[] listaNumeros = {1.0f, 50.0f, -6.0f};
        float numMayor = 0.0f;
        for(int i = 0; i < listaNumeros.length; i++)
        {
            if(numMayor < listaNumeros[i]) {


                    numMayor = listaNumeros[i];
                }




        }
        System.out.println("El numero mayor del vector es: "+numMayor);



    }
}