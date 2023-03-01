package employeerecords.employees.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import employeerecords.employees.Beans.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
    
}
