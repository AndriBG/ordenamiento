package ordenamiento;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ordenamiento {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[4];
        int temporal = 0;

        for (int i = 0; i <= 3; i++) {
            System.out.print("Introduzca el número " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        for (int i=0; i<=3; i++) {
            for (int j=0; j<=2; j++) {
                if (numeros[j]>numeros[j+1]) {
                    temporal=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=temporal;
                }
            }
        }
        
        System.out.println("resultado: ");
        for (int i=0; i<numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
