package md.tekwill.dao;
import md.tekwill.domain.Department;

public interface DepartmentDao {
    Department read(String name);
}
