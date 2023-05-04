import java.io.*;

public class Mayor3
{
    public static void main(String[] args)
    {
        int cuenta = 3;
        int[][] A = {{5, 1, 0}, {3, 2, 0}, {5, 3, 0}};
        for (int f = 0; f < A.length; f++)
        {
            for (int c = 0; c < A[f].length; c++)
            {
                {
               System.out.print(A[f][c]+" ");
                }
                if(A[f][c] > 3) {
                    cuenta++;
                }



                }
            System.out.println();




        }
        System.out.println("Numeros mayores que 3: ");

        System.out.println(cuenta-3);
    }
}




