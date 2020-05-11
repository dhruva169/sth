package com.macd.sth.dao;

import com.macd.sth.models.employee;

import java.util.List;

public interface employeeDao {
    void addEmployee(employee employee);
    void deleteEmployee(int empID);
    void updateEmployee(int empID, employee employee);
    public List<employee> getAllEmployee();
    employee getEmployeeDetails(int empID);

}
