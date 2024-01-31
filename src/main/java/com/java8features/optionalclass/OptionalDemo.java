package com.java8features.optionalclass;

import java.util.Optional;

public class OptionalDemo {

    EmployeeService employeeService = new EmployeeService();

    public void getEmployeeByID() {
        Optional<Employee> employee = employeeService.getEmployee(102);
        if (employee.isPresent()) {
            System.out.println(employee.get().getName());
        } else {
            System.out.println("There is no employee present");
        }
    }

    public static void main(String[] argd) {
        System.out.println("This is optional class demo");
        OptionalDemo optionalDemo = new OptionalDemo();
        optionalDemo.getEmployeeByID();
    }
}
