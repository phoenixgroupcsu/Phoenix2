package bcccp.tickets.season;

public class UsageRecordFactory implements IUsageRecordFactory {

	@Override
	public IUsageRecord make(String ticketId, long startDateTime) {
		UsageRecord record = new UsageRecord(ticketId, startDateTime);
		return record;
	}

}
