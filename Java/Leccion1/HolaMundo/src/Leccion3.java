
import java.util.Scanner;


public class Leccion3 {

    public static void main(String[] args) {
        System.out.println("Hola mundo desde Java");

        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programacion";
        System.out.println(miVariableCadena);

//Var - inferencia de tipos en Java
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableCadena2= " + miVariableCadena2);
        //soutv + tab
        //Reglas para definir una variable en Java

        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("Union = " + union);
        
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
        //Ejercicio : Caracteres especiales con Java
        var nombre = "Natalia";
        System.out.println("Nueva linea:\n" + nombre); 
        System.out.println("Tabulador:\t+nombre");
        System.out.println("\t\t.:Menu:.");
        System.out.println("Retroceso: \b"+ nombre);
        System.out.println("Comillas simples: \"nombre");
        System.out.println("Comillas Dobles:\""+nombre+"");
        //Clase Scanner
            
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre");
        var usuario2 = entrada.nextLine();
        System.out.println("Usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+" "+ usuario2);

        //Conversion de tipos primitivos en Java Parte 2
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        var fraseChar = "Programadores".charAt(12);
        System.out.println("fraseChar =" + fraseChar);
        System.out.println("Digite un caracter");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar =" + fraseChar);














    }

}
