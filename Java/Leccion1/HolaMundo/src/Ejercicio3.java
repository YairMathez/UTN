import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cantidad de productos");
        int cantidad = Scanner.nextInt();

        System.out.println("Precio (Producto): ");
        int precioUnitario = Scanner.nextInt();

        int importe = cantidad * precioUnitario; //Importe sin descuento

        System.out.println("\nCantidad de productos : " + cantidad);
        System.out.println("Precio Unitario: " + precioUnitario);
        System.out.println("Importe base: " + importe);

        //Ahora vemos si se aplica un descuento
        if (cantidad >= 2 && cantidad <= 5) {
            System.out.println("\nDescuento aplicable 10%");
            System.out.println("Importe con descuento: " + (importe * 0.9));

        } else if (cantidad >= 6 && cantidad <= 10) {
            System.out.println("\nDescuento aplicable: 15%");
            System.out.println("Importe con descuento : " + (importe * 0.85));
        } else if (cantidad >= 11 && cantidad >= 20) {
            System.out.println("\nDescuento aplicable: 20%");
            System.out.println("Importe con descuentos: " + (importe * 0.8));
        } else if (cantidad > 20) {
            System.out.println("\nDescuento aplicable: 45%");
            System.out.println("Importe con descuento: " + importe * 0.55);
        }

    }
}



