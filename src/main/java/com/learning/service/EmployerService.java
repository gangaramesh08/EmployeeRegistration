package com.learning.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.model.Employee;

@Service
public interface EmployerService {

    String insert(List<Employee> emp);
    List<Employee> fetchAll();

    //public String fetch();
}
