import java.io.*;
class ParImpar2
{
    public static void main(String[] args)
    {
        //Entrada de datos
int[] numeros = {3, 9, 4};
int par = 0, impar = 0, parimpar = 0;

//Proceso
        int i = 0;
        while (i <= 2)
        {
            parimpar = numeros[i] % 2;
            if(parimpar == 0)
            {
              par++;
            }
            else
            {
             impar++;
            }
            i++;

        }
        //Salida de datos
        System.out.println("Cantidad de numeros impares: "+impar);
        System.out.println("Cantidad de numeros pares: "+par);
   }
}


