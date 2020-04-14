package com.learning.model;

import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;

@Configuration
public class Employee {
    Integer id;
    String name;
    String designation;

    @NotNull
    String unit;
    String managerName;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getManagerName() {
        return managerName;
    }
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }


}
