package md.tekwill.dao.impl;

import md.tekwill.dao.DepartmentDao;
import md.tekwill.domain.Department;

public class DepartmentDaoImpl implements DepartmentDao {
    private static Department[] departments = {new Department("IT"), new Department("HR")};

    @Override
    public Department read(String name) {
        for (int i = 0; i < departments.length; i++) {
            if(departments[i].getName().equals(name)){
                return departments[i];
            }
        }
        return null;
    }
}
