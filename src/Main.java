import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        int valor1, valor2, valor3, valor4;
        int suma, resta, multiplicacion;
        JOptionPane.showMessageDialog(null, "BIENVENIDO,=============================");
        System.out.println("BIENVENIDO PORFAVOR INGRESE 4 VALORES");
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el primer valor");
        valor1 = entrada.nextInt();
        System.out.println("ingrese el segundo valor");
        valor2 = entrada.nextInt();
        System.out.println("ingrese el tercer valor");
        valor3 = entrada.nextInt();
        System.out.println("ingrese el cuarto valor");
        valor4 = entrada.nextInt();

        while (opcion != 5) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("bienvenido selecione su opcion \n"
                    + "ingrese 1 si desea sumar todos los valores\n" + "ingrese 2 si desea Restar los valores 1 y 2\n"
                    + "ingrese 3 si desea multiplicat todos los valores\n" + "ingrese 4 si desea motrar todos los valores\n" + "ingrese 5 si desea salir\n"));
            switch (opcion) {
                case 1:
                    suma = valor1 + valor2 + valor3 + valor4;
                    JOptionPane.showMessageDialog(null, "la suma de todos los valores es" + suma);
                    break;
                case 2:
                    resta = valor1 - valor2;
                    JOptionPane.showMessageDialog(null, "Su resultado de la resta es:" + resta);
                    break;
                case 3:
                    multiplicacion = valor1 * valor2 * valor3 * valor4;
                    JOptionPane.showMessageDialog(null, "Su resultado de la mult es:" + multiplicacion);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "todos los valores son :" + valor1 + " " + valor2 + " " + valor3 + " " + valor4);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "gracias por utilizar nuestro programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no existente");
                    break;

            }

        }
    }
}