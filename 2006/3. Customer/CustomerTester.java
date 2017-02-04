
public class CustomerTester {

	public static void prefixMerge(Customer[] list1, Customer[] list2, Customer[] result) {
		
		int index1 = 0;
		int index2 = 0;
		int resultIndex = 0;
		
		while (index1 < list1.length && index2 < list2.length && resultIndex < result.length) {
			
			Customer c1 = list1[index1];
			Customer c2 = list2[index2];
			
			if (c1.compareCustomer(c2) < 0) {
				result[resultIndex] = c1;
				index1++;
			}
			else if (c1.compareCustomer(c2) > 0) {
				result[resultIndex] = c2;
				index2++;
			}
			else {
				result[resultIndex] = c1;
				index1++;
				index2++;
			}
			
			resultIndex++;
		}
	}
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer("Arthur", 4920);
		Customer c2 = new Customer("Burton", 3911);
		Customer c3 = new Customer("Burton", 4944);
		Customer c4 = new Customer("Franz", 1692);
		Customer c5 = new Customer("Horton", 9221);
		Customer c6 = new Customer("Jones", 4920);
		Customer c7 = new Customer("Miller", 5554);
		Customer c8 = new Customer("Nguyen", 4339);
		
		Customer c9 = new Customer("Aaron", 1729);
		Customer c10 = new Customer("Baker", 2921);
		Customer c11 = new Customer("Dillard", 6552);
		Customer c12 = new Customer("Noble", 3335);

		Customer[] list1 = {c1, c2, c3, c4, c5, c6, c7, c8};
		Customer[] list2 = {c9, c10, c2, c11, c6, c7, c12};
		Customer[] result = new Customer[6];
		
		prefixMerge(list1, list2, result);
		
		for (Customer r: result) {
			System.out.println(r);
		}
	}

}
