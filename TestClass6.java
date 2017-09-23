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
public class TestClass6 extends JFrame implements IPaystationUI {
 

ticketPrinterTextArea = new JTextArea();
		ticketPrinterTextArea.setBackground(Color.LIGHT_GRAY);
		ticketPrinterTextArea.setText("");
		ticketPrinterTextArea.setRows(10);
		ticketPrinterTextArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ticketPrinterTextArea.setEditable(false);
		ticketPrinterTextArea.setBounds(10, 22, 295, 230);
		panel_2.add(ticketPrinterTextArea);
}
