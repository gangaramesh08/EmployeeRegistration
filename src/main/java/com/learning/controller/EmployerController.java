package com.learning.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.model.Employee;
import com.learning.service.EmployerService;

@RestController
@RequestMapping("/employee")
public class EmployerController {

    @Autowired
    EmployerService employerService;

    @GetMapping(value ="/hello")
    public String hello(){
        Map<Integer, String> map = new HashMap<>();
        return "HELLO WORLD!!!";

    }

    @GetMapping(value ="/fetch")
    public String fetch(@RequestParam String value){
        return value;

    }
    @PutMapping(value ="/update")
    public void update(){

    }
    @GetMapping(value="/fetchAll")
    public List<Employee> fetchAll(){
        return employerService.fetchAll();
    }
    @PostMapping(value = "/insert", consumes={MediaType.APPLICATION_JSON_VALUE})
    public String insert(@Valid @RequestBody  List<Employee> emp){
        String status = null;
        try{
            status = employerService.insert(emp);
        }catch(Exception e){

        }
        return status;
    }


}
