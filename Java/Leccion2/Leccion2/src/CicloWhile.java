public class CicloWhile {
    public static void main(String[] args) {
        var conteo = 0; //Inferencia de tipos
        while (conteo < 3) {
            System.out.println("conteo = " + conteo);
            conteo++; //Vamos aumentando en uno la variable
        }
        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 7);

        for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 != 0) {
                break;
            }
        } //Etiquetas Labels

            for (var contando = 0; contando < 7; contando++) {
                if (contando % 2 != 0) {
                    System.out.println("contando = " + contando);

                }
            }
        }
    }

