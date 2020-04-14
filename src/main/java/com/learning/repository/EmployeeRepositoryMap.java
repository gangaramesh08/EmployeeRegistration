package com.learning.repository;

import com.learning.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeRepositoryMap implements IEmployeeRepository {

    static Map<Integer, Employee> employeeMap = new HashMap<>();

    @Override
    public Employee getEmployee(Integer id) {
        return employeeMap.get(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeMap.forEach((k,v) -> employeeList.add(v));
        return  employeeList;
    }

    @Override
    public void insertEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    @Override
    public void insertEmployeeBatch(List<Employee> employees) {
        return;
    }
}
