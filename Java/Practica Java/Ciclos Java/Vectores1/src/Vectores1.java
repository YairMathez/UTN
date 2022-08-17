import java.util.Scanner;
public class Vectores1{
    public static void main(String args[]){
        int longitud = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuantos numeros deseas ingresar?");
        longitud = entrada.nextInt();

        int numeros[] = new int[longitud];


        for (int i = 0; i < numeros.length; i++){
            System.out.println("Por favor dame el valor #" + (i + 1));
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < numeros.length; i++){
            System.out.print("[" + numeros[i] + "]");
        }
    }
}
