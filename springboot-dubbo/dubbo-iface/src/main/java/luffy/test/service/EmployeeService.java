package luffy.test.service;

import luffy.test.bean.Employee;

public interface EmployeeService {
    void addEmployee(Employee employee);
    Employee findEmployeeById(int id);
    Integer findEmployeeCount();
}
