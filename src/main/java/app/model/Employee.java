package app.model;

public class Employee {
	private String empNo;
	private int age;
	private String name;
	private double salary;
	
	
	
	public Employee() {
		super();
	}
	public Employee(String empNo, String name, double salary,int age) {
		super();
		this.empNo = empNo;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
