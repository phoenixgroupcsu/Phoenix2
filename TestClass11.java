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
public class TestClass11 extends JFrame implements IPaystationUI {
 

public void printTicket(String carparkId, int tNo, long entryTime, long paidTime, float charge, String barcode) {
		Date entryDate = new Date(entryTime);
		Date paidDate = new Date(paidTime);
		StringBuilder builder = new StringBuilder();
		builder.append("Carpark    : " + carparkId + "\n");
		builder.append("Ticket No  : " + tNo + "\n");
		builder.append("Entry Time : " + entryDate + "\n");
		builder.append("Paid  Time : " + paidDate + "\n");
		builder.append("Charge     : " + String.format("%.2f", charge) + "\n");
		builder.append("Barcode    : " + barcode + "\n");
		
		ticketPrinterTextArea.setText(builder.toString());			
	}
	
	public static void main(String[] args) {
		
		printTicket("001", 5, 20255, 20260, 50, "3232332");
		
	}
	
}
