
package SwingOperations;
import javax.swing.JOptionPane;

public class ConfirmDialog {
    public static void main(String[] args) {
        
        int choice =JOptionPane.showConfirmDialog(null,"Do you want to quit ?","User choose",JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "You choice \"NO\"\nComplete your process");
        }
    }
}
