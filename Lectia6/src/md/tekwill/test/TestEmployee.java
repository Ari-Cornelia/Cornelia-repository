package md.tekwill.test;

import md.tekwill.domain.Department;
import md.tekwill.domain.Employee;
import md.tekwill.service.impl.EmployeeServiceImpl;

public class TestEmployee {
    public static void main(String[] args) {
        EmployeeServiceImpl employeeService= new EmployeeServiceImpl();
        Department itDepartment = new Department("IT");
        Employee employee1= new Employee("Ion","Paunescu",itDepartment);
        Employee employeeToUpdate= new Employee("Vasile","Paunescu",itDepartment);

       Employee savedEmployee= employeeService.create(employee1);
       employeeService.update(employee1.getId(),employeeToUpdate);
        System.out.println(employeeService.read(savedEmployee.getId()));
    }
}
