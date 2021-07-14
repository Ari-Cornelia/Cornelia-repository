package md.tekwill.service.impl;

import md.tekwill.dao.impl.DepartmentDaoImpl;
import md.tekwill.dao.impl.EmployeeDaoImpl;
import md.tekwill.domain.Employee;
import md.tekwill.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
private EmployeeDaoImpl employeeDao= new EmployeeDaoImpl();
private DepartmentDaoImpl departmentDao= new DepartmentDaoImpl();
    @Override
    public Employee create(Employee employee) {
        if(departmentDao.read(employee.getDepartment().getName()) == null){
            System.out.println("Departamentul nu este gasit!!!");
            return null;
        }
        return employeeDao.create(employee);
    }

    @Override
    public Employee read(long employeeId) {
        return employeeDao.read(employeeId);
    }

    @Override
    public boolean update(long employeeId, Employee updatedEmployee) {
        return false;
    }

    @Override
    public void delete(long employeeId) {

    }
}
