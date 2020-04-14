package com.learning.repository;

import com.learning.model.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository {

    public Employee getEmployee(Integer id);
    public List<Employee> getAllEmployees();
    public void insertEmployee(Employee employee);
    public void insertEmployeeBatch(List<Employee> employees);
}
