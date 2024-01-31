package com.java8features.optionalclass;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class EmployeeService {

    Map<Integer, Employee> employeeMap = new HashMap<>();
    public Optional<Employee> getEmployee(Integer id) {
        employeeMap.put(101, new Employee(1, "muna"));
        employeeMap.put(102, new Employee(2, "runa"));
        employeeMap.put(103, new Employee(3, "kuna"));
        return Optional.ofNullable(employeeMap.get(id));
    }
}
