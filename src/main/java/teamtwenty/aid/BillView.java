package teamtwenty.aid;
import java.util.logging.Logger;
import java.util.logging.Level;

public class BillView {

	BillCalculator billCalculated;

	private double expectedBill;
	private Customer customerInfo;
	private int minutesUsed;  
	private Logger log;



	
	public BillView(Customer customer,InputClass input,Address address){
		this.billCalculated = new BillCalculator(input,address);
		this.expectedBill = billCalculated.calculateExpectedBill();
		this.customerInfo = customer;
		this.minutesUsed = billCalculated.getMinutesUsed();
	}

	public void printAll(){

		log = Logger.getLogger("Logger");
		log.log(Level.INFO, "\nCustomerInfo : \nName : "+this.customerInfo.getCustomerName()+
		"\nCountry : "+this.customerInfo.getAddressInfo().getCountry()+
		"\nCity : "+this.customerInfo.getAddressInfo().getCity()+
		"\nStreet no : "+this.customerInfo.getAddressInfo().getStreetNo()+
		"\n\nMinutes used : "+this.minutesUsed+"\nExpected Total Bill : "+this.expectedBill);
	}
}
