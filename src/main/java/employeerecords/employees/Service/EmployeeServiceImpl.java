package employeerecords.employees.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import employeerecords.employees.Beans.Employee;
import employeerecords.employees.Dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getEmployees() {

        return employeeDao.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employeeDao.save(employee);
        
        return employee;
    }

    @Override
    public void deleteEmployee(Integer id) {
       employeeDao.deleteById(id);
    }

    
}
