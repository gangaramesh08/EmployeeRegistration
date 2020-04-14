package com.learning.serviceimpl;

import com.learning.model.Employee;
import com.learning.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InsertRunnable implements Runnable {
    private IEmployeeRepository employeeRepository;

    Employee e;
    Map<Integer, Employee> employeeMap;

    public InsertRunnable(Employee e,IEmployeeRepository employeeRepository) {
        this.e = e;
        this.employeeRepository = employeeRepository;
    }

    public void run() {
        employeeRepository.insertEmployee(e);
    }
}

