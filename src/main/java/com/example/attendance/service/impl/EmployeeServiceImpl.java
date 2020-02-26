package com.example.attendance.service.impl;

import com.example.attendance.domain.Employee;
import com.example.attendance.mapper.EmployeeMapper;
import com.example.attendance.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Author: 吴机杏
 * @Date: 2020/2/20 17:35
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> selectAllBycompid(Long compid) {
        Example example =new Example(Employee.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("emplcompanyid",compid)
        return employeeMapper.selectByExample(criteria);
    }

    @Override
    public Employee selectByid(Long id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean insertEmployee(Employee employee) {
        return employeeMapper.insert(employee) > 0;
    }
}
