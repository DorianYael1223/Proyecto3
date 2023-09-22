package Ejercicio1;
import javax.swing.JOptionPane;

public class Suma {
    public static void main(String[] args) {
        // Obtains user input from JOptionPane input dialogs
        String primerNumero = JOptionPane.showInputDialog("Enter the first integer");
        String segundoNumero = JOptionPane.showInputDialog("Enter the second integer");

        // Converts the input Strings into int values for calculations
        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);

        int suma = numero1 + numero2;

        // Displays the results in a JOptionPane message dialog
        JOptionPane.showMessageDialog(null, "The sum is " + suma,
                "Sum of two integers", JOptionPane.PLAIN_MESSAGE);
    }
}
