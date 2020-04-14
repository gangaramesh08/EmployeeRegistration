package com.learning.serviceimpl;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.*;

import com.learning.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.model.Employee;
import com.learning.service.EmployerService;


@Service
public class EmployerServiceImpl implements EmployerService {
    @Autowired
    private IEmployeeRepository employeeRepository;

    //static Map<Integer,Employee> employeeMap = new HashMap<>();
    public String insert(List<Employee> emp) {
        ExecutorService ex = Executors.newFixedThreadPool(emp.size());
        /*emp.forEach(e->{
            InsertCallable insertCallable = new InsertCallable(e,employeeMap);
            Future<Map<Integer, Employee>> futureMap = ex.submit(insertCallable);
            try {
                futureMap.get().forEach((k,v) -> employeeMap.put(k,v));
                System.out.println(employeeMap);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            } catch (ExecutionException executionException) {
                executionException.printStackTrace();
            }
        });*/
        emp.forEach(e->{
            InsertRunnable insertRunnable = new InsertRunnable(e,employeeRepository);
            ex.submit(insertRunnable);
        });
        ex.shutdown();
        while(!ex.isShutdown()){

        }
        if(emp.size()==(employeeRepository.getAllEmployees().size())){
            return "SUCCESS";
        }

        return "FAIL";
    }

    public List<Employee> fetchAll(){
        return employeeRepository.getAllEmployees();
    }

}

