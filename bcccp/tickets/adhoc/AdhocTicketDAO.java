package bcccp.tickets.adhoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdhocTicketDAO  implements IAdhocTicketDAO  {

	private Map<String, IAdhocTicket> currentTickets;
	private IAdhocTicketFactory adhocTicketFactory_;
	private int currentTicketNo;

	private List<IAdhocTicket> currentAdhocTickets;
		
		
	
	public AdhocTicketDAO(IAdhocTicketFactory adhocTicketFactory) {
		this.adhocTicketFactory_ = adhocTicketFactory;
		currentTickets = new HashMap<>();	
		currentAdhocTickets = new ArrayList();		
	}
	
	
	
	@Override
	public IAdhocTicket createTicket(String carparkId) {
		IAdhocTicket ticket = adhocTicketFactory_.make(carparkId, currentTicketNo++);
		currentTickets.put(ticket.getBarcode(), ticket);
		return ticket;	
	}
	
	
	@Override
	public IAdhocTicket findTicketByBarcode(String barcode) {
		for int i = 0; i <currentAdhocTickets.size (); i++0 
		{ 
		return currentAdhocTickets.get (i); 
		{
		return currentTickets.get(barcode);
	}	

	
	
	@Override
	public List<IAdhocTicket> getCurrentTickets() {		
	 return currentAdhocTickets;
	}

}
