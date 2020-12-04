package miu.edu.service.impl;

import java.util.List;

import miu.edu.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import miu.edu.domain.Employee;
import miu.edu.service.EmployeeService;

@Service
@Transactional 
public class EmployeeServiceImpl implements EmployeeService {
	
 	@Autowired
	private EmployeeRepository employeeRepository;

	public void save(Employee employee) {
		employeeRepository.save(employee);
	}
	public List<Employee> findAll() {
		return (List<Employee>)employeeRepository.findAll();
	}

	public Employee findByEmployeeNumber(Long employeeId) {
		return employeeRepository.findByEmployeeNumber(employeeId);
	}

	@Override
	public Employee getEmployeeByNumber(Integer areaCode, Integer prefix, Integer number) {
		return employeeRepository.locateOneEmployeeByHisNumber(areaCode, prefix, number);
	}
}
