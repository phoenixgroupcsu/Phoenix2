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
public class TestClass2 extends JFrame implements IPaystationUI {
 

 private JPanel contentPane;
 private JTextField displayTextField;
 private JTextField barcodeTextField;
 private IPaystationController controller;
 private JTextArea ticketPrinterTextArea;



JPanel panel = new JPanel();
panel.setBorder(new TitledBorder(null, "LCD Display", TitledBorder.LEADING, TitledBorder.TOP, null, null));
panel.setBounds(5, 5, 320, 106);
contentPane.add(panel);
panel.setLayout(null);

 

}