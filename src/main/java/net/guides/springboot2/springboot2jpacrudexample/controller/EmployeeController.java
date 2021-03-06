package net.guides.springboot2.springboot2jpacrudexample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.exception.ResourceNotFoundException;
import net.guides.springboot2.springboot2jpacrudexample.model.Employee;
import net.guides.springboot2.springboot2jpacrudexample.repository.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
		return ResponseEntity.ok().body(employee);
	}

	@PostMapping("/employees")
	public Employee createEmployee(@Valid @RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}

	
	  @PutMapping("/employees/{id}") public ResponseEntity<Employee>
	  updateEmployee(@PathVariable(value = "id") Long empId,
	  
	  @Valid @RequestBody Employee employeeDetails) throws
	  ResourceNotFoundException { Employee employee =
	  employeeRepository.findById(empId) .orElseThrow(() -> new
	  ResourceNotFoundException("Employee not found for this id :: " +
	  empId));
	  
	  employee.setMailId(employeeDetails.getMailId());
	  employee.setLastName(employeeDetails.getLastName());
	  employee.setFirstName(employeeDetails.getFirstName());
	  employee.setaLine1(employeeDetails.getaLine1());
	  employee.setaLine2(employeeDetails.getaLine2());
	  employee.setCity(employeeDetails.getCity());
	  employee.setCountry(employeeDetails.getCountry());
	  employee.setDesReq(employeeDetails.getDesReq());
	  employee.setDoB(employeeDetails.getDoB());
	  employee.setEmpId(employeeDetails.getEmpId());
	  employee.setSeatTag(employeeDetails.getSeatTag());
	  employee.setExp(employeeDetails.getExp());
	  employee.setL1Cert(employeeDetails.getL1Cert());
	  employee.setL2Cert(employeeDetails.getL2Cert());
	  employee.setMobileNo(employeeDetails.getMobileNo());
	  employee.setOdcAccReq(employeeDetails.getOdcAccReq());
	  employee.setPinCode(employeeDetails.getPinCode());
	  employee.setPrimSkill(employeeDetails.getPrimSkill());
	  employee.setProjectId(employeeDetails.getProjectId());
	  employee.setProjectName(employeeDetails.getProjectName());
	  employee.setProjRole(employeeDetails.getProjRole());
	  employee.setRepManager(employeeDetails.getRepManager());
	  employee.setSecSkill(employeeDetails.getSecSkill());
	  employee.setState(employeeDetails.getState());
	  employee.setWorkLoc(employeeDetails.getWorkLoc());
	  final Employee
	  updatedEmployee = employeeRepository.save(employee);
	  return
	  ResponseEntity.ok(updatedEmployee); }
	 

	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

		employeeRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
