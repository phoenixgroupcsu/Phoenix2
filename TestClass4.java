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
public class TestClass4 extends JFrame implements IPaystationUI {
 

JButton issueAdhocTicketButton = new JButton("Pay");
		issueAdhocTicketButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pay();
			}

		});
		issueAdhocTicketButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		issueAdhocTicketButton.setBounds(25, 283, 287, 46);
		contentPane.add(issueAdhocTicketButton);
}
