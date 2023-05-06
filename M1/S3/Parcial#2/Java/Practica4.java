import java.io.*;
public class variablesAB
{
    public static void main(String[] args) 
    {
        int[] numerosA = {1, 5, 2};
        int[] numerosB = {0, 0, 0};
        for (int i = 0; i <= 2; i++) 
        {
            numerosB[i] = numerosA[i];
            numerosB[i] = numerosA[i];
            numerosB[i] = numerosA[i];
        }

        System.out.println(+numerosB[0]);
        System.out.println(+numerosB[1]);
        System.out.println(+numerosB[2]);
    }
}