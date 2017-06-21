package app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import app.model.Employee;

public class IEmployeeServiceImpl implements IEmployeeService {
	private final AtomicLong empIdGen = new AtomicLong();
	List<Employee> employees = new ArrayList<Employee>();
	public IEmployeeServiceImpl() {
		Employee employee = new Employee();
		employee.setEmpNo("1001");
		employee.setName("Gautham");
		employee.setAge(24);
		employee.setSalary(6000.00);
		employees.add(employee);


		Employee employee1 = new Employee();
		employee1.setEmpNo("1002");
		employee1.setName("Dinesh");
		employee1.setAge(26);
		employee1.setSalary(6400.00);
		employees.add(employee);
	}

	@Override
	public Employee getEmployee(String empId) {
		
		

		for (Employee employee : employees) {
			if (employee.getEmpNo().equals(empId)) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		
		employee.setEmpNo(""+empIdGen.incrementAndGet());
		employees.add(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee source) {
		Employee employee = getEmployee(source.getEmpNo());
		employee.setName(source.getName());
		employee.setAge(source.getAge());
		employee.setSalary(source.getSalary());
		
		
		return employee;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public String deleteEmployee(String empId) {

		
		for (Employee employee : employees) {
			if (employee.getEmpNo().equals(empId)) {
				employees.remove(employee);
				return empId;
			}
		}
		return null;
	}


}
