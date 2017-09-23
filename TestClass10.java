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
public class TestClass10 extends JFrame implements IPaystationUI {
 

private void log(String message) {
		System.out.println("EntryUI : " + message);
	}
	
	public static void main(String[] args) {
		
		log("Test message1 ");
		
	}
	
}
