import javax.swing.*;

public class Ekvationsraknare {
    public static void main(String[] args) {

        //Variables
        String s = JOptionPane.showInputDialog(null, "Vi ska räkna ut en ekvation med pq-formeln. Välj ditt p-värde");
        double a = Integer.parseInt(s);

        String s1 = JOptionPane.showInputDialog(null, "Välj ditt q-värde");
        double b = Integer.parseInt(s1);

        double e = Math.sqrt((a/2) * (a/2) - b);

        double c = -(a/2) + e;
        double d = -(a/2) - e;

        JOptionPane.showMessageDialog(null, "Ditt x1-värde blev" + c + "och ditt x2-värde blev" + d);
    }
}

