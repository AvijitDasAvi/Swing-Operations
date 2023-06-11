
package SwingOperations;
import javax.swing.JOptionPane;

public class InputDialog {
    public static void main(String[] args) {
        
        String f_name = JOptionPane.showInputDialog(null,"Enter your first name:","User input",JOptionPane.QUESTION_MESSAGE);
        String l_name = JOptionPane.showInputDialog(null,"Enter your last name:");
        String name = f_name + " " +l_name;
        JOptionPane.showMessageDialog(null,"Your full name is: "+ name);
    }
}
