package employeerecords.employees.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import employeerecords.employees.Beans.Employee;
import employeerecords.employees.Service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeservice;

    @GetMapping("/employeedetail")
    public List<Employee> getEmployeesData() {
        return employeeservice.getEmployees();
    }

    @GetMapping("/delete{id}")
    public void deleteEmployeesData(@PathVariable Integer id) {

        employeeservice.deleteEmployee(id);

    }

    @PostMapping("/addData")
    public Employee aEmployee(@RequestBody Employee employee) {

        Employee emp = employeeservice.addEmployee(employee);
        return emp;
    }

}