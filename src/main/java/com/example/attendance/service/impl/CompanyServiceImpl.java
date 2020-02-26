package com.example.attendance.service.impl;

import com.example.attendance.domain.Company;
import com.example.attendance.mapper.CompanyMapper;
import com.example.attendance.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 吴机杏
 * @Date: 2020/2/18 16:13
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;
    @Override
    public boolean insertCompany(Company company) {
        return companyMapper.insert(company) > 0;
    }

    @Override
    public Company selectByid(Long id) {
        return companyMapper.selectByPrimaryKey(id);
    }
}
