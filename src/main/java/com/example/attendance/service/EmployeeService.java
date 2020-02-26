package com.example.attendance.service;

import com.example.attendance.domain.Employee;

import java.util.List;

/**
 * @Author: 吴机杏
 * @Date: 2020/2/20 17:16
 */
public interface EmployeeService {
    List<Employee> selectAllBycompid(Long compid);
    Employee selectByid(Long id);
    boolean insertEmployee(Employee employee);
}
