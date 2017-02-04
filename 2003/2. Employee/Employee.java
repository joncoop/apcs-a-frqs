
public class Employee {
	
	int age;
	int years;
	double salary;
	int id;
	
	public Employee(int age, int years, double salary, int id) {
		this.age = age;
		this.years = years;
		this.salary = salary;
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return "Employee [age=" + age + ", years=" + years + ", salary=" + salary + ", id=" + id + "]";
	}

}
