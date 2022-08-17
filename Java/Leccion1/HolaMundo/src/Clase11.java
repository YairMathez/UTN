import java.util.Scanner;

public class Clase11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite las notas");

        float nota1 = Float.parseFloat(entrada.nextLine());
        float nota2 = Float.parseFloat(entrada.nextLine());
        float nota3 = Float.parseFloat(entrada.nextLine());

        var prom = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio es de = " + prom);

    }
}

