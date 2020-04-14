/***
 *
 1. WAP to process N requests to create employees of a company.
 The employees of a particular unit/organization should be processed as a batch
 and the app should trigger a notification once a batch is successful.
 Notifications should also be triggered for the below requirements (Notifications can be Sysout for now)
 2. For the above application, you should be able to
 A)fetch
 All employees of a unit/organization
 An employee
 B)Insert
 Batch insert of employees
 Insert of a new employee
 C)Update
 Batch update of employees
 Update a single employee


 */

package com.learning;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ={"com.learning.*,com.learning.controller.*,com.learning.service.*"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);

    }

}
