package org.acme.quarkus.service;


import org.acme.quarkus.model.Employee;

public interface EmployeeService {

    /**
     * This method publishes message to
     * the topic
     * @param employee
     */
    void createEmployee(Employee employee);
}
