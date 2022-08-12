package barclays.tdd.demo.service;

import java.util.ArrayList;
import java.util.List;

import barclays.tdd.demo.model.Employee;

public class EmployeeServiceTests {

	private static Employee emp;
	private static EmployeeService empService;
	private static List<Employee> empList;

	public static void setUp() {

		emp = new Employee();
		empService = new EmployeeService();
		empList = new ArrayList<>();

	}

	public void testAddEmp() {
		
		emp = new Employee();
		
		empService.addEmp(Employee employee);


	}

	public void testUpdateEmp() {

	}

	public void testDeleteEmp() {

	}

	public void testGetEmpById() {

	}

	public void testGetAllEmps() {

	}

}
