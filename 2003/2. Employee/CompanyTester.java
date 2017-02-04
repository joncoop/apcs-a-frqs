
public class CompanyTester {
	
	public static void printArray(Object[] arr) {
		for (Object element: arr) {
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {
		Employee[] employees = new Employee[5];
		
		employees[0] = new Employee(55, 30, 100000, 1); // 2/3 retire
		employees[1] = new Employee(29,  4,  40000, 2); // 1/3 stay
		employees[2] = new Employee(50, 25,  60000, 3); // 1/3 stay
		employees[3] = new Employee(80, 40, 500000, 4); // 3/3 retire
		employees[4] = new Employee(35, 15,  55000, 5); // 0/3 stay
		
				
		Company comp = new Company(employees, 65, 28, 100000);
		
		Employee[] currentEmployees = comp.getEmpList();
		printArray(currentEmployees);
		System.out.println(comp.getSalaryBudget());
		System.out.println();
		
		comp.processRetirements();
		
		currentEmployees = comp.getEmpList();
		printArray(currentEmployees);
		System.out.println(comp.getSalaryBudget());
		System.out.println();	
		
	}
	
}
