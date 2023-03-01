package employeerecords.employees.Service;

import java.util.List;

import employeerecords.employees.Beans.Employee;

public interface EmployeeService {

   public List<Employee> getEmployees();

   public Employee addEmployee(Employee employee);

   public void deleteEmployee(Integer id);

}
