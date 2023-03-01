package employeerecords.employees.Beans;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    private Integer ID;
    private String Name;
    private String Role;

    public Employee(){}

    public Employee(int id, String name, String role) {
        this.ID = id;
        this.Name = name;
        this.Role = role;
    }

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getRole() {
        return Role;
    }

    public void setID(Integer iD) {
        this.ID = iD;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setRole(String role) {
        this.Role = role;
    }

    @Override
    public String toString() {

        return "Employee id = " + this.ID + ", Name = " + this.Name + ", Role = " + this.Role;

    }
}
