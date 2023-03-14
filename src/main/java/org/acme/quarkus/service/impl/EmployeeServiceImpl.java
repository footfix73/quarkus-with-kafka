package org.acme.quarkus.service.impl;

import org.acme.quarkus.events.producer.EmployeeProducer;
import org.acme.quarkus.model.Employee;
import org.acme.quarkus.service.EmployeeService;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeProducer employeeProducer;

    public EmployeeServiceImpl(EmployeeProducer employeeProducer) {
        this.employeeProducer = employeeProducer;
    }

    @Override
    public void createEmployee(Employee employee) {
        employeeProducer.createEmployee(employee);
    }
}
