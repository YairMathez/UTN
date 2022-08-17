import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Leccion6 {
    public static void main(String[] args) {
        System.out.println("Hola mundo desde Java");
        final double sueldoFijo = 1000;
        double comision = 150;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite cuantos coches vendio");
        double carrosV = Double.parseDouble(entrada.nextLine());
        double ComisionCrros = carrosV * comision;

        System.out.println("Digite el monto total de los coches que vendio");
        double MontoTotalC = Double.parseDouble(entrada.nextLine());
        double comisionInd = (5 * MontoTotalC) / 100;
        double salario = sueldoFijo * ComisionCrros + comisionInd;
        System.out.println("salario = " + salario);
    }
}