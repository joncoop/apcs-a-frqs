
public class Company {

	Employee[] empList;
	int retireAge;
	int retireYears;
	double retireSalary;
	double salaryBudget;
	
	public Company(Employee[] empList, int retireAge, int retireYears, double retireSalary) {
		this.empList = empList;
		this.retireAge = retireAge;
		this.retireYears = retireYears;
		this.retireSalary = retireSalary;
		
		this.salaryBudget = 0;
		for (Employee e : empList) {
			this.salaryBudget += e.getSalary();
		}
	}
	
	private boolean employeeIsEligile(Employee employee) {
		int met = 0;
		
		if (employee.getAge() >= retireAge)
			met++;
		if (employee.getYears() >= retireYears)
			met++;
		if (employee.getSalary() >= retireSalary)
			met++;
		
		return met >= 2;
	}
	
	public void processRetirements() {
		int retireCount = 0;
		
		for (Employee e: empList) {
			if (employeeIsEligile(e)) {
				retireCount++;
			}
		}
		
		int remainingCount = empList.length - retireCount;
		
		Employee[] temp = new Employee[remainingCount];

		int tempIndex = 0;
		for (Employee e: empList) {
			if (!employeeIsEligile(e)) {
				temp[tempIndex] = e;
				tempIndex++;
			}
			else {
				salaryBudget -= e.getSalary();
			}
		}

		empList = temp;
	}

	public Employee[] getEmpList() {
		return empList;
	}

	public void setEmpList(Employee[] empList) {
		this.empList = empList;
	}

	public int getRetireAge() {
		return retireAge;
	}

	public void setRetireAge(int retireAge) {
		this.retireAge = retireAge;
	}

	public int getRetireYears() {
		return retireYears;
	}

	public void setRetireYears(int retireYears) {
		this.retireYears = retireYears;
	}

	public double getRetireSalary() {
		return retireSalary;
	}

	public void setRetireSalary(double retireSalary) {
		this.retireSalary = retireSalary;
	}

	public double getSalaryBudget() {
		return salaryBudget;
	}

	public void setSalaryBudget(double salaryBudget) {
		this.salaryBudget = salaryBudget;
	}
}
