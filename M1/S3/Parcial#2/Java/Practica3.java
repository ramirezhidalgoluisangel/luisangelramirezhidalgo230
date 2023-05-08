import java.io.*;
class intercambiar
{
    public static void main(String[] args)
    {
        int[] numerosA = {4, 7, 8};
        int[] numerosB = {0, 0, 0};
        for (int i = 0; i < 3; i++)
        {
            numerosB[i] = numerosA[i];
        }
        {
            for (int i = 0; i < 3; i++)
            {
                System.out.println(+numerosB[i]);
            }
        }
    }
}