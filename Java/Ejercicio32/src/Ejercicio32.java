import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System);
          int horasSemanales;
          float salarioHora, salarioTotal:
        System.out.println("Digite las horas semanales trabajadas: ");
          horasSemanales = Integer.parseInt{entrada.nextLine ());
        System.out.println("Digite el salario que cobra por hora: ");
        salarioHora = Float.parseFloat(entrada.nextLine());

        salarioTotal = horasSemanales * salarioHora;
            System.out.println("\nEl salario semanal es:US$ " + salarioTotal);

    }
}
