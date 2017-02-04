
public class Customer {

	String name;
	int idNum;
	
	public Customer(String name, int idNum) {
		this.name = name;
		this.idNum = idNum;
	}
	
	public int compareCustomer(Customer other) {
		
		if (this.name.equals(other.name)) {
			return this.idNum - other.idNum;
		}
		else {
			return this.name.compareTo(other.name);
		}
	}

	public String toString() {
		return "Customer [name=" + name + ", idNum=" + idNum + "]";
	}

}
