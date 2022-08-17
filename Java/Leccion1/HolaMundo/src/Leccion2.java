public class Leccion2 {
    public static void main(String[] args) {
        var condicion = true;
        if (condicion) {
            System.out.println("Condicion verdadera"); //Condicional simple

        } else {
            System.out.println("Condicion falsa"); //Condicional doble
        }

        var numero = 2;
        var numeroTexto = "Numero desconocido";
        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Numero dos";

        } else if (numero == 3) {
            numeroTexto = "Numero Tres";
        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}













