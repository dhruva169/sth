package com.macd.sth.dao;

import com.macd.sth.models.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class employeeDaoImpl implements employeeDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    @Override
    public void addEmployee(employee employee) {
        String sql = "insert into employee(empID, firstName, lastName, phoneNumber, address, salary) values (?,?,?,?,?)";
        jdbcTemplate.update(sql, employee.getEmpID(), employee.getFirstName(), employee.getLastName(), employee.getPhoneNumber(),
                employee.getAddress(), employee.getSalary());
    }

    @Override
    public void deleteEmployee(int empID) {
        String sql = "delete from employee where empID=?";
        jdbcTemplate.update(sql, empID);
    }

    @Override
    public void updateEmployee(int empID, employee employee) {
        String sql = "update employee set firstName=?, lastName=?, phoneNumber=?, address=?, salary=? where empID=?";
        jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getPhoneNumber(),
                employee.getAddress(), employee.getSalary(), empID);
    }

    @Override
    public List<employee> getAllEmployee() {
        String sql = "select * from employee";
        RowMapper<employee> rowMapper = new BeanPropertyRowMapper<>(employee.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public employee getEmployeeDetails(int empID) {
        String sql = "select * from employee where empID=?";
        RowMapper<employee> rowMapper = new BeanPropertyRowMapper<>(employee.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, empID);
    }
}
