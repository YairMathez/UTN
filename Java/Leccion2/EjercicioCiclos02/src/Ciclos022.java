import javax.swing.JOptionPane;
import java.util.Scanner;
public class Ciclos022 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while (numero != 0) {
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El numero"+numero+"es POSITIVO");
            } else {
                    JOptionPane.showMessageDialog(null, "El numero"+numero+"es NEGATIVO");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        }
        JOptionPane.showMessageDialog(null, "El numero"+numero+"finaliza el programa");
    }
}
