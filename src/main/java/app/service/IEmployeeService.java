package app.service;
import java.util.List;

import app.model.Employee;


public interface IEmployeeService {
	
	public Employee getEmployee(String empId);
	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public String deleteEmployee(String empId);
	public List<Employee> getEmployees();

}