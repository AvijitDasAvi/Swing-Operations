
package SwingOperations;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class MessageDialog5 {
    public static void main(String[] args) {
        
        ImageIcon image = new ImageIcon("icon.png");
        JOptionPane.showMessageDialog(null, "Wrong User","Warning",-1,image);
        //use 5 parameters
        //window location,message,window title,icon,custom icon
    }
}
