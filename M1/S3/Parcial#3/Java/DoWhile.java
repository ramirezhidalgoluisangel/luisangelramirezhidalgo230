import java.io.*;
class DoWhile
{
    public static void main (String[] args)
    {
        int [] numeros = {3,-5,-7, 7, 46};
        int i= 0;
do{
     System.out.print(+numeros[i]);        
    i=i+2;
} while  (i<=5);
}
}