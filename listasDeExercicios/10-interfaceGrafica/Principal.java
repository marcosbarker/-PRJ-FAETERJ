import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Principal {
  public static void main(String[] args) {

    try {
      UIManager.setLookAndFeel(
        "com.sun.javax.swing.plaf.gtk.GTKLookAndFeel"
        );
    } catch (Exception e) {
      JOptionPane.showMessageDialog (
        null,
        e.getClass() + "\n" + e.getMessage(),
        "Ops!",
        JOptionPane.ERROR_MESSAGE
      );
    }
    
    ConversorTemp ct = new ConversorTemp();
    ct.exibir();
  }
}