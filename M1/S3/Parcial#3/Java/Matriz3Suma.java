import java.io.*;
class MatrizSuma
{
    public static void main(String[] args)
    {
        int[][] A = {{0, 2}, {5, 4}};
        int suma = 0;
        for (int f = 0; f < A.length; f++)
        {
            for (int c = 0; c < A[f].length; c++)
            {
                {
               System.out.print(A[f][c]+" ");
                }
                //if(A[f][c] > 3)
                {
                    suma++;
                   suma = suma + A[f][c];
                }

                }
            System.out.println();
            }

        System.out.println(suma);
    }
}
