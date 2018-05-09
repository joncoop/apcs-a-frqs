
public class Customer {

	private String name;
	private int idNum;
	
	public Customer(String name, int idNum) {
		this.name = name;
		this.idNum = idNum;
	}
	
	public String getName() {
		return name;	
	}
	
	public int getID() {
		return idNum;	
	}
	
	public int compareCustomer(Customer other) {
		
		if (this.name.equals(other.name)) {
			return this.getID() - other.getID();
			// Actual FRQ requires getters to access fields since quiestion doesn't give field names.
			// Otherwise we could just use the following:
			// return this.idNum - other.idNum;
		}
		else {
			return this.getName().compareTo(other.getName());
			// return this.name.compareTo(other.name);
		}
	}

	public String toString() {
		return "Customer [name=" + name + ", idNum=" + idNum + "]";
	}

}
