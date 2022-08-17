import java.util.Scanner;

        public class Leccion7 {
            public static void main(String[] args) {

            }
        public class Ejercicio7 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            float nota1,nota2,nota3,suma;
            //Guardamos las 3 notas
            System.out.println("Digite las calificaciones: ");
            nota1 = float.parseFloat (entrada.nextLine());
            nota2 = float.parseFloat (entrada.nextLine());
            nota3 = float.parseFloat (entrada.nextLine());

            suma = nota1 + nota2 + nota3;
            System.out.println("\nLa suma es:" + suma );


        }

    }
}
