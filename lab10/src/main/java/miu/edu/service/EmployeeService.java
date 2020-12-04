package miu.edu.service;

import java.util.List;

import miu.edu.domain.Employee;
 
public interface EmployeeService {

	public void save(Employee employee);
	public List<Employee> findAll();
	public Employee findByEmployeeNumber(Long employeeId);
	public Employee getEmployeeByNumber(Integer areaCode, Integer prefix, Integer number);
}
