import java.util.Scanner;
public class Cadenas {
    public static void main(String args[]){
        String cadena_original = "" , cadena_substraccion = "";
        int num_caracteres = 0 , desde = 0, hasta = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce una cadena de caracteres: ");
        cadena_original = in.nextLine();

        num_caracteres = cadena_original.length();

        System.out.println("La cadena de caracteres " + cadena_original + " Pose " + num_caracteres + "caracteres. ");

        System.out.print("¡Desde que caracter deseeeas obtener la nueva cadena?:");
        desde = in.nextInt();
        System.out.print("¿Hasta que caracter deseas obtener la cadena?:");
        hasta = in.nextInt();
        cadena_substraccion = cadena_original.substring(desde , hasta);
        System.out.println("La nueva cadena es:" + cadena_substraccion);




    }
}
