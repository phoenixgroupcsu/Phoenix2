
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
public class integrationTestClass5 extends JFrame implements IPaystationUI {
 

 private JPanel contentPane;
 private JTextField displayTextField;
 private JTextField barcodeTextField;
 private IPaystationController controller;
 private JTextArea ticketPrinterTextArea;



public PaystationUI(int x, int y) {
		setTitle("PayStation UI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x, y, 350, 710);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "LCD Display", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(5, 5, 320, 106);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton issueAdhocTicketButton = new JButton("Pay");
		issueAdhocTicketButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pay();
			}

		});
		issueAdhocTicketButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		issueAdhocTicketButton.setBounds(25, 283, 287, 46);
		contentPane.add(issueAdhocTicketButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ticket Reader", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(15, 122, 310, 153);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
}
 

}