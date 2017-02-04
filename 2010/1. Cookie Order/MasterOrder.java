import java.util.ArrayList;
import java.util.List;

public class MasterOrder {

	private List<CookieOrder> orders;
	
	public MasterOrder() {
		orders = new ArrayList<CookieOrder>();
	}
	
	public void addOrder(CookieOrder theOrder) {
		orders.add(theOrder);
	}
	
	public int getTotalBoxes() {
		int count = 0;
		
		for (CookieOrder order: orders) {
			count += order.getNumBoxes();
		}
		
		return count;
	}
	
	public int removeVariety(String cookieVar) {
		
		int count = 0;
		
		for (int i=orders.size()-1; i>=0; i--) {
			CookieOrder order = orders.get(i);
			String variety = order.getVariety();
			
			if (cookieVar.equals(variety)) {
				count += order.getNumBoxes();
				orders.remove(i);
			}
		}
		
		return count;
	}

	public String toString() {
		String result = "Master Order: \n";
		
		for (CookieOrder order: orders) {
			result += "  " + order + "\n";
		}
				
		return result.trim();
	}
}
