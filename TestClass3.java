import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.UIManager;
 

@SuppressWarnings("serial")
public class TestClass3 extends JFrame implements IPaystationUI {
 

 displayTextField = new JTextField();
displayTextField.setHorizontalAlignment(SwingConstants.CENTER);
//displayTextField.setText("Push Button");
displayTextField.setFont(new Font("Tahoma", Font.PLAIN, 24));
displayTextField.setEditable(false);
displayTextField.setBounds(10, 15, 298, 82);
panel.add(displayTextField);
displayTextField.setColumns(10);

}
