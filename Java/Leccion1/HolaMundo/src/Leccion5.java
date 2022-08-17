import java. util.Scanner;
public class Leccion5 {
    public static void main (String[]args ) {
        Scanner entrada = new Scanner(System.in);
        float guillermo,luis,juan = 0,total;
        System.out.println("Digite la cantidad de dinero de guillermo: ");
        guillermo = Float.parseFloat(entrada.nextLine());

        luis = guillermo / 2;
        juan - (luis + guillermo) / 2 ;
        total - luis + guillermo + juan;
        System.out.println("\nEl dinero de luis es:U$$ " + luis);
        System.out.println("El dinero de juan es:U$$ " + juan);
        System.out.println("El total de dinero entre los tres es:U$$ " + total);

    }

}

