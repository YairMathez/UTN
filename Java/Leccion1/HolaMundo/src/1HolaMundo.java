
import java.util.Scanner;

public class HolaMundo {

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
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comillas simples: \"nombre");
        System.out.println("Comillas Dobles:\"" + nombre + "");

        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre");
        var usuario2 = entrada.nextLine();
        System.out.println("Usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: " + titulo2 + " " + usuario2);
        //Conversion de tipos primitivos en Java Parte 2
        /*var edadTexto =String.copyValueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        var fraseChar = "Programadores".charAt(12);
        System.out.println("fraseChar =" + fraseChar);
        System.out.println("Digite un caracter");
        fraseChar = entrada.nextLine().charAt(0);*/

        //Clase 7 Java soluciones de sum,a , division , resta, multiplicacion
        /*int num1 = 5, num2 =4;
        var solucion = num1 + num2;
        System.out.println("Solucion de la suma=" + solucion);

        solucion = num1 - num2;
        System.out.println("Solucion de la resta =" + solucion);

        solucion= num1 * num2;
        System.out.println("Solucion de la multiplicacion =" + solucion);


        solucion= num1 / num2;
        System.out.println("Solucion de la division = " + solucion);

        var solucion2 =  3.4D / num2;
        System.out.println("solucion2 resultado de la divisio =" + solucion2);

        solucion= num1 & num2; //Guarda el residuo entero de la division
        System.out.println("solucion = " + solucion); // 5/4

        if (num1 % 2==0)
            System.out.println("Es un numero Par");
        else
            System.out.println("Es un numero impar");



        int varNum1 = 1 , varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2;//Una operacion
        System.out.println("varNum3 = " + varNum3);

        varNum1 += 1; // Es lo mismo que varNum1 = varNum1 + 1;
        System.out.println("varNum1 = " + varNum1);
         
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        varNum1 *= 5;
        System.out.println("varNum1 = " + varNum1);
        varNum3 /= 4;
        System.out.println("varNum3 = " + varNum3);
        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);*\


         */
        //Operadores unarios: Cambio de signo
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);

        //Operador de Negacion (Aplica para variables boolean)
        var varC = true; //Esta literar por deafault en Java es de tipo boolean
        var varD = !varC; //Aqui esta invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);

        //Operadores de igualdad y Relacionales
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);

        var cadenaA = "Hello";
        var cadenaB = "Bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);

        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);

        //Operadores Relacionales
        var gVar = aNum >= bNum;// > >= < <= == !=
        System.out.println("gVar = " + gVar);

        if (aNum % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        var edad = 30;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        //Operador condiconal and
        /*var valorA = 7;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;

        if (respuesta)
            System.out.println("Esta dentro del rango establecido");
        else
            System.out.println("Esta fuera del rango establecido");
        {
            
        }
        var vacaciones = false;
        var diaLibre = false;
        if(vacaciones || diaLibre )
            System.out.println("Puede asistir al juego de su hijo");
        else
            System.out.println("No puede asistir al juego de su hijo");
        */
        //Operador ternario
       /* var resultadoT = (5 > 4) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 7;
        resultadoT = (numeroT % 2== 0) ? "Es par" : "Es impar";
        System.out.println("resultadoT = " + resultadoT);*/
       
       var x = 5;
       var y = 10;
       var z = ++x + y--;
        System.out.println("x = " + x);// = 6
        System.out.println("y = " + y);// 9
        System.out.println("z = " + z);//16
        
        
        var solucionArimetica = 4 + 5 * 6 /3; // 4 + (5 * 6) / 3) =30 /3 = 10 +4 = 14
        System.out.println("solucionArimetica = " + solucionArimetica);
        
        solucionArimetica = (4 + 5) * 6 / 3; // 4+ 5 =9 * 6 = 54 /3 =10
        System.out.println("solucionArimetica = " + solucionArimetica);
        
        
    }

}
