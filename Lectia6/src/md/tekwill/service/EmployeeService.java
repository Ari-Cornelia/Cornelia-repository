package md.tekwill.service;

import md.tekwill.domain.Employee;

public interface EmployeeService {
    Employee create(Employee employee);

    Employee read(long employeeId);

    boolean update(long employeeId, Employee updatedEmployee);

    void delete(long employeeId);
}
