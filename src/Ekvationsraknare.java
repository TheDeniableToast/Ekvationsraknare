import javax.swing.*;

public class Ekvationsraknare {
    public static void main(String[] args) {

        //Variables
        String s = JOptionPane.showInputDialog(null, "Vi ska räkna ut en ekvation med formeln ax + b = 0. Välj ditt a-värde");
        double a = Integer.parseInt(s);

        String s1 = JOptionPane.showInputDialog(null, "Välj ditt b-värde");
        double b = Integer.parseInt(s1);

        double c = (-b)/(a);

        JOptionPane.showMessageDialog(null, "Lösningen på ekvationen ax + b = 0 är" + c);
    }
}

